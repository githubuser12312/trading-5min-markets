package five.min.markets.feature;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketDataFeature;

public interface FeatureMapper {
	
	boolean initialise(IMarketData marketData);
	
	MarketDataFeature getFeature(IMarketData marketData);
	
	void updateFeature(IMarketData marketData);
	
	FeatureType getFeatureType();
	
	void setFastMode(boolean fastMode);
}
