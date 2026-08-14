package five.min.markets.feature;

import five.min.markets.entity.MarketData;

public interface MapFeature {

	void addFeature(MarketData marketData);
	
	void reset();
}
