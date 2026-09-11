package five.min.markets.feature;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import lombok.Getter;

@Getter
public  abstract class AbstractSmaFeature extends AbstractBufferedFeature  implements FeatureMapper{

	private double sum = 0;
	private Double average = null;
	private FeatureType featureType;
	private MarketDataRepository marketDataRepository;
	private boolean initialised = false;
	
	public AbstractSmaFeature(FeatureType featureType,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		super((int) featureType.config.get("length"), marketDataFeatureRepository);
		this.featureType = featureType;
	}
	
	@Override
	public MarketDataFeature getFeature(MarketData marketData) {
		MarketDataFeature marketDataFeature = null;
		if(!initialised) initialise(marketData);
		if(average != null) {
			marketDataFeature = getFeatureFromDb(marketData);
			mapFeatureValue(marketDataFeature, marketData);
			marketDataFeatureRepository.save(marketDataFeature);
		}
		update(marketData);
		return marketDataFeature;
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
		MarketDataFeature marketDataFeature = getFeature(marketData);
		if(marketDataFeature != null) {
			marketDataFeatureRepository.save(marketDataFeature);
		}
	}
	
	protected abstract void mapFeatureValue(MarketDataFeature marketDataFeature, MarketData marketData);
	
	
	public void reset() {
		buffer.clear();
		sum = 0;
		average = null;
	}

	@Override
	public boolean initialise(MarketData marketData) {
		if(!initialised) return true;
		List<MarketData> barsBefore = marketDataRepository.findBarsBefore(marketData, PageRequest.of(0, buffer.maxSize()));
		barsBefore = barsBefore.reversed();
		barsBefore.forEach(b -> update(b));
		initialised = true;
		return barsBefore.size() == buffer.maxSize();
	}
	
	
	
}
