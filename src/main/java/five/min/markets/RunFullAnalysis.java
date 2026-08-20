package five.min.markets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.StatType;
import five.min.markets.feature.UpdateMarketDataFeatures;
import five.min.markets.pmf.CalculateFeatureProbability;
import five.min.markets.stat.CalculateStats;
import lombok.extern.slf4j.Slf4j;

@Component
@Profile("fullAnalysis")
@Slf4j
public class RunFullAnalysis implements CommandLineRunner {

	private UpdateMarketDataFeatures updateMarketDataFeatures;
	private CalculateFeatureProbability calculateFeatureProbability;
	private CalculateStats calculateStats;
	
	public RunFullAnalysis(UpdateMarketDataFeatures updateMarketDataFeatures,
			CalculateFeatureProbability calculateFeatureProbability,
			CalculateStats calculateStats) {
		this.updateMarketDataFeatures = updateMarketDataFeatures;
		this.calculateFeatureProbability = calculateFeatureProbability;
		this.calculateStats = calculateStats;
	}
	
	@Override
	public void run(String... args) throws Exception {
		Integer maxOrder = getMaxOrder();
		for(int i = 0; i <= maxOrder; i++) {
			log.info("Running {} order feature mappers", i);
			updateMarketDataFeatures.mapFeatures(i);
			log.info("Running {} order stats", i);
			calculateStats.caculateStats(i);
		}
		log.info("Calculate feature probabilities");
		calculateFeatureProbability.caculateProbabilityMasses();
	}
	
	private Integer getMaxOrder() {
		return Math.max(FeatureType.maxOrder(), StatType.maxOrder());
	}

}
