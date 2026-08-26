package five.min.markets.feature;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;

public interface FeatureMapper {
	
	MarketDataFeature getFeature(MarketData marketData);
	
	void updateFeature(MarketData marketData);
	
	FeatureType getFeatureType();
}
