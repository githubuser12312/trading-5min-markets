package five.min.markets.simulate;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.simulate.entity.SimulationRun;
import five.min.markets.simulate.entity.StrategySummary;
import five.min.markets.simulate.entity.TradeRecord;
import five.min.markets.simulate.entity.TradeState;
import five.min.markets.simulate.repo.SimulationRunRepository;
import five.min.markets.simulate.repo.StrategySummaryRepository;
import five.min.markets.simulate.repo.TradeRecordRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public final class MarketSimulationEngine {

    private final List<Strategy> strategies;
    private final TradeRecordRepository tradeRepo;
    private final StrategySummaryRepository summaryRepo;
    private final SimulationRunRepository simulationRunRepository;
    private final MarketDataRepository marketDataRepository;
    
    public MarketSimulationEngine(List<Strategy> strategies,
                                  TradeRecordRepository tradeRepo,
                                  StrategySummaryRepository summaryRepo,
                                  SimulationRunRepository simulationRunRepository,
                                  MarketDataRepository marketDataRepository) {
        this.strategies = strategies;
        this.tradeRepo = tradeRepo;
        this.summaryRepo = summaryRepo;
        this.simulationRunRepository = simulationRunRepository;
        this.marketDataRepository = marketDataRepository;
    }
    
    public void runSimulationOn(Market market) {
    	SimulationRun simulationRun = new SimulationRun();
    	simulationRun.setMarket(market);
    	simulationRun = simulationRunRepository.save(simulationRun); 
    	SimulationContext simulationContext = new SimulationContext(simulationRun);
    	for (Strategy s : strategies) {
        	StrategySummary strategySummary = new StrategySummary();
        	strategySummary.setStrategyId(s.id());
        	strategySummary.setSimulationRun(simulationRun);
        	strategySummary = summaryRepo.save(strategySummary);
        	simulationContext.getStrategySummaries().put(s.id(), strategySummary);
        }
    	process(market, simulationContext);
    }

    private void process(Market market, SimulationContext simulationContext) {
    	Pageable pageable = PageRequest.of(0, 1000, Sort.by(Direction.ASC, "start"));
    	Slice<MarketData> marketData = null;
    	Instant after = LocalDateTime.of(1900, 1, 1, 0, 0).toInstant(ZoneOffset.UTC);
    	int loopCount = 0;
    	do {
    		log.info("Simulating market {}-{} date cutoff {} page {} ", market.getCode(), market.getPeriod(), after, pageable);
    		marketData = marketDataRepository.findByMarketEqualsAndStartGreaterThan(market, after, pageable);
    		for(MarketData m : marketData) {
    			process(m, simulationContext);
    			after = m.getStart();
    		}
    		if(loopCount % 10 == 0) {
    			log.info("Flush summaries and clear closed trades, loop count {}", loopCount);
    			flushSummariesToDb(simulationContext);
    			simulationContext.clearClosedTrades();
    		}
    		loopCount++;
    	} while(marketData.hasNext());
    	flushSummariesToDb(simulationContext);
    }
    
    private void processStrategy(Strategy strategy, SimulationContext simulationContext, MarketData marketData) {
		closeTrades(strategy, simulationContext, marketData);
		openTrades(strategy, simulationContext, marketData);
    }
    
    private void closeTrades(Strategy strategy, SimulationContext simulationContext, MarketData marketData) {
    	simulationContext.getOpenTrades(strategy).forEach(t -> {
    		strategy.evaluateExit(t, marketData, simulationContext).ifPresent(e -> {
    			TradeRecord closed = closeTrade(e, marketData, strategy, t);
    			simulationContext.updateStrategyStats(strategy, closed);
    		});
    	});
    }
    
    private void openTrades(Strategy strategy, SimulationContext simulationContext, MarketData marketData) {
    	strategy.evaluate(marketData, simulationContext).ifPresent(e -> {
    		TradeRecord tradeRecord = createTrade(e, marketData, strategy, simulationContext);
    		simulationContext.addTrade(strategy, tradeRecord);
    	});
    }
    
    /**
     * Process a new MarketData bar through all strategies.
     */
    private void process(MarketData data, SimulationContext simulationContext) {
    	for (Strategy strategy : strategies) {
            processStrategy(strategy, simulationContext, data);
        }
    	//flushSummariesToDb(simulationContext);
    	//simulationContext.clearClosedTrades();
    }
    

    private TradeRecord createTrade(EntrySignal signal, MarketData data, Strategy strategy, SimulationContext simulationContext) {
        String tradeId = UUID.randomUUID().toString();
        PricingModel entryPricingModel = strategy.entryPricing();
        double entryPrice = entryPricingModel.determinePrice(data, signal.getPositionType());
        int quantity = entryPricingModel.quantity(data, signal.getPositionType(), entryPrice);

        // Persist trade record
        TradeRecord record = new TradeRecord();
        record.setTradeId(tradeId);
        record.setStrategyId(strategy.id());
        record.setEntryMarketDataId(data);
        record.setPositionType(signal.getPositionType());
        record.setQuantity(quantity);
        record.setEntryPrice(entryPrice);
        record.setState(TradeState.OPEN);
        record.setSimulationRun(simulationContext.getSimulationRun());
        return record;
    }

    private TradeRecord closeTrade(ExitSignal signal, MarketData data, Strategy strategy, TradeRecord tradeRecord) {
        double exitPrice = strategy.exitPricing()
                .determinePrice(data, tradeRecord.getPositionType());

        double pnl = calculatePnl(tradeRecord, exitPrice);
        tradeRecord.markClosed(data, exitPrice, pnl);
        return tradeRepo.save(tradeRecord);
    }

    private double calculatePnl(TradeRecord trade, double exitPrice) {
        double gross = (exitPrice - trade.getEntryPrice()) * trade.getQuantity();
        return trade.getPositionType() == PositionType.SHORT ? -gross : gross;
    }

    /**
     * Synchronize runtime stats into DB summaries.
     * Call this at the end of the simulation or periodically.
     */
    private void flushSummariesToDb(SimulationContext simulationContext) {
    	Map<String, StrategySummary> copy = new HashMap<>(simulationContext.getStrategySummaries());
        copy.forEach((k, v) -> {
        	StrategySummary saved = summaryRepo.save(v);
        	simulationContext.getStrategySummaries().put(k, saved);
        });
    }
}