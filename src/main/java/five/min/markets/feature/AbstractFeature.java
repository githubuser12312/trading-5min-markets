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
	private ObjectPoolFactory objectPoolFactory;
	@Getter @Setter
	private MappingMode mappingMode = MappingMode.HISTORIC;
	public AbstractFeature(MarketDataFeatureRepository marketDataFeatureRepository,
			ObjectPoolFactory objectPoolFactory) {
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.objectPoolFactory = objectPoolFactory;
	}
	
	protected MarketDataFeature getFeatureFromDb(IMarketData marketData) {
		if(mappingMode == MappingMode.RUNTIME) {
			MarketDataFeature feature = objectPoolFactory.borrow(MarketDataFeature.class);
			feature.setFeatureType(getFeatureType());
			return feature;
		}
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
