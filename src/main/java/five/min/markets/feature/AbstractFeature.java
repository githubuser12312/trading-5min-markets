package five.min.markets.feature;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.pool.ObjectPoolFactory;
import five.min.markets.repo.MarketDataFeatureRepository;
import lombok.Getter;
import lombok.Setter;

public abstract class AbstractFeature implements FeatureMapper {

	protected MarketDataFeatureRepository marketDataFeatureRepository;
	@Getter @Setter
	private boolean isFastMode = false;
	private ObjectPoolFactory objectPoolFactory;
	
	public AbstractFeature(MarketDataFeatureRepository marketDataFeatureRepository,
			ObjectPoolFactory objectPoolFactory) {
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.objectPoolFactory = objectPoolFactory;
	}
	
	protected MarketDataFeature getFeatureFromDb(IMarketData marketData) {
		MarketDataFeature currentFeature = marketDataFeatureRepository.findByMarketDataEqualsAndFeatureTypeEquals(
				marketData.getId(), getFeatureType());
		if(currentFeature == null) {
			currentFeature = new MarketDataFeature();
		}
		currentFeature.reset();
		currentFeature.setFeatureType(getFeatureType());
		currentFeature.setMarketData((MarketData)marketData);
		return currentFeature;
	}
}
