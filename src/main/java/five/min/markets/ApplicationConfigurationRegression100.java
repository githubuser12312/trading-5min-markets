package five.min.markets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.StatType;
import five.min.markets.feature.FeatureMapper;
import five.min.markets.feature.RegressionFeature;
import five.min.markets.feature.RegressionTrendFeature;
import five.min.markets.pmf.ProbabilityCalculator;
import five.min.markets.pmf.StringProbabilityCalculator;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.StringProbabilityMassRepository;
import five.min.markets.stat.CalculateStat;
import five.min.markets.stat.FeatureTypeGreaterThanZeroNTileStat;
import five.min.markets.stat.FeatureTypeLessThanEqualsZeroNTileStat;
import five.min.markets.stat.FeatureTypeNtileStat;

@Configuration
public class ApplicationConfigurationRegression100 {

	public ApplicationConfigurationRegression100() {
		// TODO Auto-generated constructor stub
	}

	@Bean
	RegressionFeature regressionSlope100(MarketDataFeatureRepository marketDataFeatureRepository) {
		return new RegressionFeature(FeatureType.REGRESSION_SLOPE_100, marketDataFeatureRepository);
	}
	
	@Bean
	CalculateStat regression100SlopeUpQuartiles(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new FeatureTypeGreaterThanZeroNTileStat(
				StatType.SLOPE_UP_QUARTILE_REG100, marketDataFeatureRepository, nTileStatRepository);
	}
	
	@Bean
	CalculateStat regression100SlopeDownQuartiles(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new FeatureTypeLessThanEqualsZeroNTileStat(
				StatType.SLOPE_DOWN_QUARTILE_REG100, marketDataFeatureRepository, nTileStatRepository);
	}
	
	@Bean
	FeatureMapper upTrendRegression100Feature(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new RegressionTrendFeature(marketDataFeatureRepository, 
				nTileStatRepository, 
				StatType.SLOPE_UP_QUARTILE_REG100,
				FeatureType.REGRESSION_100_TREND_UP, 
				FeatureType.REGRESSION_SLOPE_100);
	}
	
	@Bean
	FeatureMapper downTrendRegression100Feature(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new RegressionTrendFeature(marketDataFeatureRepository, 
				nTileStatRepository, 
				StatType.SLOPE_DOWN_QUARTILE_REG100,
				FeatureType.REGRESSION_100_TREND_DOWN, 
				FeatureType.REGRESSION_SLOPE_100);
	}
	
	@Bean
	ProbabilityCalculator regresssion100SlopeUp(ProbabilityMassContainerRepository probabilityMassContainerRepository,
			StringProbabilityMassRepository stringProbabilityMassRepository,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		return new StringProbabilityCalculator(FeatureType.REGRESSION_100_TREND_UP, 
				probabilityMassContainerRepository, 
				stringProbabilityMassRepository, marketDataFeatureRepository);
	}
	
	@Bean
	ProbabilityCalculator regresssion100SlopeDown(ProbabilityMassContainerRepository probabilityMassContainerRepository,
			StringProbabilityMassRepository stringProbabilityMassRepository,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		return new StringProbabilityCalculator(FeatureType.REGRESSION_100_TREND_DOWN, 
				probabilityMassContainerRepository, 
				stringProbabilityMassRepository, marketDataFeatureRepository);
	}
}
