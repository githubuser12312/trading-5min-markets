package five.min.markets.feature;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LastBarFeatureMapper extends AbstractFeature {

	private MarketData lastBar;
	
	public LastBarFeatureMapper(MarketDataFeatureRepository marketDataFeatureRepository) {
		super(marketDataFeatureRepository);
	}

	@Override
	public MarketDataFeature getFeature(MarketData marketData) {
		if(lastBar == null) {
			log.info("New dataset");
			lastBar = marketData;
			return null;
		}
		MarketDataFeature currentFeature = getFeatureFromDb(marketData);
		currentFeature.reset();
		if(lastBar.getUp()) {
			currentFeature.setBooleanValue(Boolean.TRUE);
		} else {
			currentFeature.setBooleanValue(Boolean.FALSE);
		}
		lastBar = marketData;
		return currentFeature;
	}

	@Override
	public void updateFeature(MarketData marketData) {
		MarketDataFeature currentFeature = getFeature(marketData);
		if(currentFeature != null) {
			marketDataFeatureRepository.save(currentFeature);
		}
	}

	@Override
	public FeatureType getFeatureType() {
		return FeatureType.LAST_BAR_UP;
	}

}
