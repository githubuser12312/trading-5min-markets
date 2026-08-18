package five.min.markets.feature;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class LastBarFeatureMapper implements FeatureMapper {

	private MarketData lastBar;
	private MarketDataFeatureRepository marketDataFeatureRepository;
	
	public LastBarFeatureMapper(MarketDataFeatureRepository marketDataFeatureRepository) {
		this.marketDataFeatureRepository = marketDataFeatureRepository;
	}
	
	@Override
	public void updateFeature(MarketData marketData) {
		if(lastBar == null) {
			log.info("New dataset");
			lastBar = marketData;
			return;
		}
		MarketDataFeature currentFeature = marketDataFeatureRepository.findByMarketDataEqualsAndFeatureTypeEquals(marketData, FeatureType.LAST_BAR_UP);
		if(currentFeature == null) {
			currentFeature = new MarketDataFeature();
			currentFeature.setFeatureType(FeatureType.LAST_BAR_UP);
			currentFeature.setMarketData(marketData);
		}
		currentFeature.reset();
		if(lastBar.getUp()) {
			currentFeature.setBooleanValue(Boolean.TRUE);
		} else {
			currentFeature.setBooleanValue(Boolean.FALSE);
		}
		marketDataFeatureRepository.save(currentFeature);
		lastBar = marketData;
	}

}
