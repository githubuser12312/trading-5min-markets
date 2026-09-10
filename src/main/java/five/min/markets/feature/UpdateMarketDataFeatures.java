package five.min.markets.feature;

import java.util.List;

import org.springframework.stereotype.Component;

import five.min.markets.entity.MarketData;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UpdateMarketDataFeatures {

	private List<FeatureMapper> featureMappers;
	public UpdateMarketDataFeatures(
			List<FeatureMapper> featureMappers) {
		this.featureMappers = featureMappers;
	}
	
	public void mapFeatures(MarketData marketData, Integer featureOrder) {
		for(FeatureMapper featureMapper : featureMappers) {
			if(featureMapper.getFeatureType().order == featureOrder) {
				log.debug("Mapping feature {} for market {} data {}", 
						featureMapper.getClass().getSimpleName(), 
						marketData.getMarket().getCode(),
						marketData.getStart());
				featureMapper.updateFeature(marketData);
			}
		}
	}
}
