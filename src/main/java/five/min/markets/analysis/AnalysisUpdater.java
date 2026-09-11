package five.min.markets.analysis;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.StatType;
import five.min.markets.feature.UpdateMarketDataFeatures;
import five.min.markets.pmf.CalculateFeatureProbability;
import five.min.markets.stat.CalculateStats;
import lombok.extern.slf4j.Slf4j;

@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
@Slf4j
public class AnalysisUpdater {
	
	private UpdateMarketDataFeatures updateMarketDataFeatures;
	private CalculateFeatureProbability calculateFeatureProbability;
	private CalculateStats calculateStats;

	private final int maxOrder = getMaxOrder();
	
	public AnalysisUpdater(UpdateMarketDataFeatures updateMarketDataFeatures,
			CalculateFeatureProbability calculateFeatureProbability, CalculateStats calculateStats) {
		this.updateMarketDataFeatures = updateMarketDataFeatures;
		this.calculateFeatureProbability = calculateFeatureProbability;
		this.calculateStats = calculateStats;
	}

	public void updateAnalysis(MarketData marketData) {
		for(int i = 0, len = maxOrder; i <= len; i++) {
			updateMarketDataFeatures.mapFeatures(marketData, i);
			calculateStats.caculateStats(marketData, i);
			calculateFeatureProbability.caculateProbabilityMasses(marketData, i);
		}
	}
	
	private Integer getMaxOrder() {
		return Math.max(FeatureType.maxOrder(), StatType.maxOrder());
	}

}
