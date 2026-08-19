package five.min.markets.feature;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.NTileStat;
import five.min.markets.entity.StatType;
import five.min.markets.entity.TrendClassification;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RegressionTrendFeature extends AbstractFeature {

	private NTileStatRepository nTileStatRepository;
	private FeatureType featureType;
	private StatType statType;
	private FeatureType baseFeatureType;
	private Boolean isDownSlope;
	public RegressionTrendFeature(
			MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository,
			StatType sourceStat,
			FeatureType featureType,
			FeatureType baseFeatureType) {
		super(marketDataFeatureRepository);
		this.nTileStatRepository = nTileStatRepository;
		this.featureType = featureType;
		this.statType = sourceStat;
		this.baseFeatureType = baseFeatureType;
		this.isDownSlope = (Boolean) featureType.config.get("isDown");
	}

	@Override
	public void updateFeature(MarketData marketData) {
		List<NTileStat> nTileStats = nTileStatRepository.findByMarketAndStatType(
				marketData.getMarket(), statType, Sort.by(Direction.ASC, "tile"));
		MarketDataFeature regressionFeature = marketDataFeatureRepository
				.findByMarketDataEqualsAndFeatureTypeEquals(marketData, baseFeatureType);
		if(regressionFeature == null) {
			log.info("No feature for {} and market data {}", baseFeatureType, marketData.getId());
			return;
		}
		Double slope = regressionFeature.getDoubleValue();
		if(slope == null) {
			log.info("No value for feature {} and market data {}", baseFeatureType, marketData.getId());
			return;
		}
		if(isDownSlope && slope >= 0) {
			log.debug("Slope is positive feature is for down slope");
			return;
		}
		MarketDataFeature trendFeature = getFeature(marketData);
		NTileStat applicable = null;
		for(int i = 0, len = nTileStats.size(); i < len; i++) {
			NTileStat stat = nTileStats.get(i);
			if(slope <= stat.getDoubleValue() || (i+1) == len) {
				applicable = stat;
				break;
			}
		}
		if(applicable == null) {
			log.error("Applicable stat is null for feature {}, base feature {}, slope {}", 
					featureType, baseFeatureType, slope);
			return;
		}
		TrendClassification trend = TrendClassification.trend(applicable.getTile(), featureType);
		trendFeature.setStringValue(trend.name());
		marketDataFeatureRepository.save(trendFeature);
	} 

	@Override
	public FeatureType getFeatureType() {
		return featureType;
	}

}
