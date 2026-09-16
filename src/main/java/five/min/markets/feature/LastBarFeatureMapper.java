package five.min.markets.feature;

import java.util.List;

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
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
@Scope("prototype")
public class LastBarFeatureMapper extends AbstractFeature {

	private IMarketData lastBar;
	private MarketDataRepository marketDataRepository;
	
	public LastBarFeatureMapper(MarketDataFeatureRepository marketDataFeatureRepository,
			MarketDataRepository marketDataRepository,
			ObjectPoolFactory objectPoolFactory) {
		super(marketDataFeatureRepository, objectPoolFactory);
		this.marketDataRepository = marketDataRepository;
	}

	@Override
	public MarketDataFeature getFeature(IMarketData marketData) {
		if(lastBar == null && !initialise(marketData)) {
			log.info("New dataset");
			lastBar = marketData;
			return null;
		}
		MarketDataFeature currentFeature = getFeatureFromDb(marketData);
		if(lastBar.getUp()) {
			currentFeature.setBooleanValue(Boolean.TRUE);
		} else {
			currentFeature.setBooleanValue(Boolean.FALSE);
		}
		lastBar = marketData;
		return currentFeature;
	}

	@Override
	public void updateFeature(IMarketData marketData) {
		MarketDataFeature currentFeature = getFeature(marketData);
		if(currentFeature != null) {
			marketDataFeatureRepository.save(currentFeature);
		}
	}

	@Override
	public FeatureType getFeatureType() {
		return FeatureType.LAST_BAR_UP;
	}

	@Override
	public boolean initialise(IMarketData marketData) {
		List<MarketData> barBefore = marketDataRepository.findBarsBefore(marketData, PageRequest.of(0, 1));
		if(barBefore == null || barBefore.isEmpty()) return false;
		lastBar = barBefore.get(0);
		return true;
		
	}

}
