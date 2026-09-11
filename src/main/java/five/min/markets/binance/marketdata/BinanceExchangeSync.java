package five.min.markets.binance.marketdata;

import java.util.List;

import org.springframework.stereotype.Component;

import five.min.markets.analysis.AnalysisUpdater;
import five.min.markets.binance.marketdata.rest.BinanceRestKline;
import five.min.markets.entity.Market;
import five.min.markets.entity.Source;
import five.min.markets.repo.MarketRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BinanceExchangeSync {

	private MarketRepository marketRepository;
	private BinanceRestKline binanceRestKline;
	private BinanceCsvLineProcessor binanceCsvLineProcessor;
	
	public BinanceExchangeSync(MarketRepository marketRepository,
			BinanceCsvLineProcessor binanceCsvLineProcessor,
			BinanceRestKline binanceRestKline) {
		this.marketRepository = marketRepository;
		this.binanceCsvLineProcessor = binanceCsvLineProcessor;
		this.binanceRestKline = binanceRestKline;
	}
	
	public void synchronizeMarkets(AnalysisUpdater analysisUpdater) {
		List<Market> markets = marketRepository.findMarketBySourceEquals(Source.BINANCE);
		for(Market market : markets ) {
			synchronizeMarket(market, analysisUpdater);
		}
	}
	
	public void synchronizeMarket(Market market,AnalysisUpdater analysisUpdater) {
		List<String[]> data = binanceRestKline.getData(market);
		data.forEach(line -> binanceCsvLineProcessor.processCsvLine(line, market, m -> analysisUpdater.updateAnalysis(m)));
	}
	
}
