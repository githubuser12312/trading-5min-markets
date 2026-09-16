package five.min.markets.feature;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.stat.regression.RegressionResults;
import org.apache.commons.math3.stat.regression.SimpleRegression;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.pool.ObjectPoolFactory;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;

@Scope("prototype")
public class RegressionFeature extends AbstractFeature {

	private List<Double> data ;
	private int length;
	private FeatureType featureType;
	private MarketDataRepository marketDataRepository;
	
	public RegressionFeature(FeatureType featureType, 
			MarketDataFeatureRepository marketDataFeatureRepository,
			MarketDataRepository marketDataRepository,
			ObjectPoolFactory objectPoolFactory) {
		super(marketDataFeatureRepository, objectPoolFactory);
		this.length = (int) featureType.config.get("length");
		this.featureType = featureType;
		data = new ArrayList<>(length);
		this.marketDataRepository = marketDataRepository;
	}

	@Override
	public MarketDataFeature getFeature(IMarketData marketData) {
		if(data.isEmpty()) {
			initialise(marketData);
		}
		if(data.size() < length) {
			data.add(marketData.getClose());
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
		data.add(marketData.getClose());
		return markteDataFeature;
	}
	
	@Override
	public void updateFeature(IMarketData marketData) {
		MarketDataFeature markteDataFeature = getFeature(marketData);
		if(markteDataFeature != null) {
			marketDataFeatureRepository.save(markteDataFeature);
		}
	}

	@Override
	public FeatureType getFeatureType() {
		return featureType;
	}

	@Override
	public boolean initialise(IMarketData marketData) {
		List<MarketData> pastBars = marketDataRepository.findBarsBefore(marketData, PageRequest.of(0, length));
		pastBars = pastBars.reversed();
		pastBars.forEach(b -> data.add(b.getClose()));
		return pastBars.size() == length;
	}


}
