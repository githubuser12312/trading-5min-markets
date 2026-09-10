package five.min.markets.pmf;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;

public interface ProbabilityCalculator {

	public void caculateProbaility(MarketData market);
	
	public FeatureType getFeatureType();
	
}
