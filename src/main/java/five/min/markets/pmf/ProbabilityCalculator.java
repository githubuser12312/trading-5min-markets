package five.min.markets.pmf;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;

public interface ProbabilityCalculator {

	public void caculateProbaility(Market market);
	
	public FeatureType getFeatureType();
	
}
