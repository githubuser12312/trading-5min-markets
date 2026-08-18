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
	private MarketDataFeatureRepository marketDataFeatureRepository;
	
	public AbstractSmaFeature(FeatureType featureType,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		super((int) featureType.config.get("length"));
		this.featureType = featureType;
		this.marketDataFeatureRepository = marketDataFeatureRepository;
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
	
	private MarketDataFeature getFeature(MarketData marketData) {
		MarketDataFeature currentFeature = marketDataFeatureRepository.findByMarketDataEqualsAndFeatureTypeEquals(marketData, featureType);
		if(currentFeature == null) {
			currentFeature = new MarketDataFeature();
			currentFeature.setFeatureType(featureType);
			currentFeature.setMarketData(marketData);
		}
		currentFeature.reset();
		return currentFeature;
	}
	
	public void reset() {
		buffer.clear();
		sum = 0;
		average = null;
	}
	
}
