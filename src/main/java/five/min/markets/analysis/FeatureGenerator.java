package five.min.markets.analysis;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.StatType;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.feature.FeatureMapper;
import five.min.markets.feature.MappingMode;
import five.min.markets.feature.UpdateMarketDataFeatures;
import five.min.markets.pmf.CalculateFeatureProbability;
import five.min.markets.pool.ObjectPoolFactory;
import five.min.markets.stat.CalculateStats;

@Component
@Scope("prototype")
public class FeatureGenerator {

	private List<FeatureMapper> featureMappers;
	private ObjectPoolFactory objectPoolFactory;
	private final int maxOrder = getMaxOrder();
	
	public FeatureGenerator(List<FeatureMapper> featureMappers, ObjectPoolFactory objectPoolFactory) {
		this.featureMappers = featureMappers;
		this.objectPoolFactory = objectPoolFactory;
		featureMappers.forEach(f -> f.setMappingMode(MappingMode.RUNTIME));
	}

	public MarketDataFeature[] getFeatures(IMarketData marketData) {
		MarketDataFeature[] features = new MarketDataFeature[featureMappers.size()];
		((RuntimeMarketData) marketData).setFeatures(features);
		int count = 0;
		for(int i = 0, len = maxOrder; i <= len; i++) {
			for(FeatureMapper featureMapper : featureMappers) {
				if(featureMapper.getFeatureType().order == i) {
					features[count] = featureMapper.getFeature(marketData);
					count++;
				}
			}
		}
		return features;
	}
	
	public void returnToPool(MarketDataFeature[] features) {
		for(MarketDataFeature marketDataFeature : features) {
			objectPoolFactory.give(marketDataFeature);
		}
	}
	
	private Integer getMaxOrder() {
		return Math.max(FeatureType.maxOrder(), StatType.maxOrder());
	}
}
