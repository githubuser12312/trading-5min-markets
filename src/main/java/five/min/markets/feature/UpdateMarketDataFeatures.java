package five.min.markets.feature;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import five.min.markets.entity.MarketData;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
@Slf4j
public class UpdateMarketDataFeatures {

	@Getter
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
