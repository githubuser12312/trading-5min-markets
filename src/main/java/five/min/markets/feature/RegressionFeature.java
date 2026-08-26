package five.min.markets.feature;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.stat.regression.RegressionResults;
import org.apache.commons.math3.stat.regression.SimpleRegression;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;

public class RegressionFeature extends AbstractFeature {

	private List<Double> data ;
	private int length;
	private FeatureType featureType;
	
	public RegressionFeature(FeatureType featureType, 
			MarketDataFeatureRepository marketDataFeatureRepository) {
		super(marketDataFeatureRepository);
		this.length = (int) featureType.config.get("length");
		this.featureType = featureType;
		data = new ArrayList<>(length);
	}

	@Override
	public MarketDataFeature getFeature(MarketData marketData) {
		if(data.size() < length) {
			data.add(marketData.getClose().doubleValue());
			return null;
		}
		SimpleRegression simpleRegression = new SimpleRegression();
		for(int i = 0; i < data.size(); i++) {
			simpleRegression.addData(i, data.get(i));
		}
		double slope = simpleRegression.getSlope();
		if(slope > 0) {
			slope = Math.floor(slope * 100) / 100;
		} else {
			slope = Math.ceil(slope * 100) / 100;
		}
		MarketDataFeature markteDataFeature = getFeatureFromDb(marketData);
		markteDataFeature.setDoubleValue(slope);
		data.remove(0);
		data.add(marketData.getClose().doubleValue());
		return markteDataFeature;
	}
	
	@Override
	public void updateFeature(MarketData marketData) {
		MarketDataFeature markteDataFeature = getFeature(marketData);
		if(markteDataFeature != null) {
			marketDataFeatureRepository.save(markteDataFeature);
		}
	}

	@Override
	public FeatureType getFeatureType() {
		return featureType;
	}


}
