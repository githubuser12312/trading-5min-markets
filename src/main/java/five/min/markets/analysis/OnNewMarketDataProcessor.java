package five.min.markets.analysis;

import org.springframework.stereotype.Component;

import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketDataRepository;
import jakarta.transaction.Transactional;

@Component
public class OnNewMarketDataProcessor {

	private MarketDataRepository marketDataRepository;
	private AnalysisUpdater analysisUpdater;

	public OnNewMarketDataProcessor(MarketDataRepository marketDataRepository, AnalysisUpdater analysisUpdater) {
		this.marketDataRepository = marketDataRepository;
		this.analysisUpdater = analysisUpdater;
	}



	@Transactional
	public MarketData processNewMarketData(MarketData marketData) {
		marketData = marketDataRepository.save(marketData);
		analysisUpdater.updateAnalysis(marketData);
		marketData.getFeatures();
		return marketData;
	}
	
}
