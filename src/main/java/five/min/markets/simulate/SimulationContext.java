package five.min.markets.simulate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import five.min.markets.simulate.entity.SimulationRun;
import five.min.markets.simulate.entity.StrategySummary;
import five.min.markets.simulate.entity.TradeRecord;
import five.min.markets.simulate.entity.TradeState;
import lombok.Data;

@Data
public class SimulationContext {
	private final Map<String, List<TradeRecord>> strategeryTrades = new HashMap<>();
    private final Map<String, Object> config = new HashMap<>();
    private final Map<String, StrategySummary> strategySummaries = new HashMap<>();
    private final SimulationRun simulationRun;
    
    public SimulationContext(SimulationRun simulationRun) {
    	this.simulationRun = simulationRun;
    }
    
    public void addTrade(Strategy strategy, TradeRecord trade) {
    	strategeryTrades.computeIfAbsent(strategy.id(), (s) -> new ArrayList<>());
    	strategeryTrades.get(strategy.id()).add(trade);
    }
    
    private List<TradeRecord> getByState(String strategyId, TradeState state) {
    	if(!strategeryTrades.containsKey(strategyId)) return Collections.emptyList();
    	return strategeryTrades
    			.get(strategyId)
    			.stream()
    			.filter(t -> t.getState() == state)
    			.toList();
    }
    
    private List<TradeRecord> getByState(Strategy strategy, TradeState state) {
    	return getByState(strategy.id(), state);
    }
    
    public List<TradeRecord> getOpenTrades(Strategy strategy) {
    	return getByState(strategy, TradeState.OPEN);
    }
    
    public void clearClosedTrades() {
    	strategeryTrades.forEach((k, v) -> {
        	List<TradeRecord> closed = getByState(k, TradeState.CLOSED);
        	strategeryTrades.get(k).removeAll(closed);
    	});
    }
    
    public void updateStrategyStats(Strategy strategy, TradeRecord tradeRecord) {
    	if(tradeRecord.getState() != TradeState.CLOSED) return;
    	StrategySummary strategySummary = strategySummaries.get(strategy.id());
    	if(strategySummary == null) {
    		throw new RuntimeException("Strategy summyar for " + strategy.id() + " not found");
    	}
    	strategySummary.computeSummaryFromTrades(tradeRecord);
    	
    }
}
