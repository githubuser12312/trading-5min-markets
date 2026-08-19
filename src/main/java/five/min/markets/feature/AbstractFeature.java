package five.min.markets.feature;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;

public abstract class AbstractFeature implements FeatureMapper {

	protected MarketDataFeatureRepository marketDataFeatureRepository;
	
	public AbstractFeature(MarketDataFeatureRepository marketDataFeatureRepository) {
		this.marketDataFeatureRepository = marketDataFeatureRepository;
	}
	
	protected MarketDataFeature getFeature(MarketData marketData) {
		MarketDataFeature currentFeature = marketDataFeatureRepository.findByMarketDataEqualsAndFeatureTypeEquals(
				marketData, getFeatureType());
		if(currentFeature == null) {
			currentFeature = new MarketDataFeature();
			currentFeature.setFeatureType(getFeatureType());
			currentFeature.setMarketData(marketData);
		}
		currentFeature.reset();
		return currentFeature;
	}
}
