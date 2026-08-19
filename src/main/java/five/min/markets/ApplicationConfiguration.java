package five.min.markets;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.StatType;
import five.min.markets.feature.FeatureMapper;
import five.min.markets.feature.RegressionFeature;
import five.min.markets.feature.RegressionTrendFeature;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;
import five.min.markets.stat.CalculateStat;
import five.min.markets.stat.FeatureTypeGreaterThanZeroNTileStat;
import five.min.markets.stat.FeatureTypeLessThanEqualsZeroNTileStat;
import five.min.markets.stat.FeatureTypeNtileStat;

@Configuration
public class ApplicationConfiguration {

	public ApplicationConfiguration() {
		// TODO Auto-generated constructor stub
	}


	@Bean
	RegressionFeature regressionSlope10(MarketDataFeatureRepository marketDataFeatureRepository) {
		return new RegressionFeature(FeatureType.REGRESSION_SLOPE_10, marketDataFeatureRepository);
	}
	
	@Bean
	CalculateStat regression10SlopeUpQuartiles(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new FeatureTypeGreaterThanZeroNTileStat(
				StatType.SLOPE_UP_QUARTILE_REG10, marketDataFeatureRepository, nTileStatRepository);
	}
	
	@Bean
	CalculateStat regression10SlopeDownQuartiles(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new FeatureTypeLessThanEqualsZeroNTileStat(
				StatType.SLOPE_DOWN_QUARTILE_REG10, marketDataFeatureRepository, nTileStatRepository);
	}
	
	@Bean
	FeatureMapper upTrendRegression10Feature(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new RegressionTrendFeature(marketDataFeatureRepository, 
				nTileStatRepository, 
				StatType.SLOPE_UP_QUARTILE_REG10,
				FeatureType.REGRESSION_10_TREND_UP, 
				FeatureType.REGRESSION_SLOPE_10);
	}
	
	@Bean
	FeatureMapper downTrendRegression10Feature(MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		return new RegressionTrendFeature(marketDataFeatureRepository, 
				nTileStatRepository, 
				StatType.SLOPE_DOWN_QUARTILE_REG10,
				FeatureType.REGRESSION_10_TREND_DOWN, 
				FeatureType.REGRESSION_SLOPE_10);
	}
}
