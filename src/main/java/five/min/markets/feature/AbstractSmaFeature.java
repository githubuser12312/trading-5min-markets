package five.min.markets.feature;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;
import lombok.Getter;

@Getter
public  abstract class AbstractSmaFeature extends AbstractBufferedFeature  implements FeatureMapper{

	private double sum = 0;
	private Double average = null;
	private FeatureType featureType;
	
	public AbstractSmaFeature(FeatureType featureType,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		super((int) featureType.config.get("length"), marketDataFeatureRepository);
		this.featureType = featureType;
	}

	protected void update(MarketData marketData) {
		if(isFull()) {
			MarketData removed = (MarketData) buffer.remove();
			sum -= removed.getClose().doubleValue();
		}
		sum += marketData.getClose().doubleValue();
		buffer.add(marketData);
		if(isFull()) {
			average = sum / buffer.size();
		}
	}

	@Override
	public void updateFeature(MarketData marketData) {
		if(average != null) {
			MarketDataFeature marketDataFeature = getFeature(marketData);
			mapFeatureValue(marketDataFeature, marketData);
			marketDataFeatureRepository.save(marketDataFeature);
		}
		update(marketData);
	}
	
	protected abstract void mapFeatureValue(MarketDataFeature marketDataFeature, MarketData marketData);
	
	
	public void reset() {
		buffer.clear();
		sum = 0;
		average = null;
	}
	
}
