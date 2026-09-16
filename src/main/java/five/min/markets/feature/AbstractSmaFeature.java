package five.min.markets.feature;

import java.util.List;

import org.springframework.data.domain.PageRequest;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.pool.ObjectPoolFactory;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import lombok.Getter;

@Getter
public  abstract class AbstractSmaFeature extends AbstractBufferedFeature  implements FeatureMapper {

	private double sum = 0;
	private Double average = null;
	private FeatureType featureType;
	private MarketDataRepository marketDataRepository;
	private boolean initialised = false;
	
	public AbstractSmaFeature(FeatureType featureType,
			MarketDataFeatureRepository marketDataFeatureRepository,
			ObjectPoolFactory objectPoolFactory) {
		super((int) featureType.config.get("length"), marketDataFeatureRepository, objectPoolFactory);
		this.featureType = featureType;
	}
	
	@Override
	public MarketDataFeature getFeature(IMarketData marketData) {
		MarketDataFeature marketDataFeature = null;
		if(!initialised) initialise(marketData);
		if(average != null) {
			marketDataFeature = getFeatureFromDb(marketData);
			mapFeatureValue(marketDataFeature, marketData);
		}
		update(marketData);
		return marketDataFeature;
	}
	
	protected void update(IMarketData marketData) {
		if(isFull()) {
			MarketData removed = (MarketData) buffer.remove();
			sum -= removed.getClose();
		}
		sum += marketData.getClose();
		buffer.add(marketData);
		if(isFull()) {
			average = sum / buffer.size();
		}
	}

	@Override
	public void updateFeature(IMarketData marketData) {
		MarketDataFeature marketDataFeature = getFeature(marketData);
		if(marketDataFeature != null) {
			marketDataFeatureRepository.save(marketDataFeature);
		}
	}
	
	protected abstract void mapFeatureValue(MarketDataFeature marketDataFeature, IMarketData marketData);
	
	
	public void reset() {
		buffer.clear();
		sum = 0;
		average = null;
	}

	@Override
	public boolean initialise(IMarketData marketData) {
		if(!initialised) return true;
		List<MarketData> barsBefore = marketDataRepository.findBarsBefore(marketData, PageRequest.of(0, buffer.maxSize()));
		barsBefore = barsBefore.reversed();
		barsBefore.forEach(b -> update(b));
		initialised = true;
		return barsBefore.size() == buffer.maxSize();
	}
	
	
	
}
