package five.min.markets.feature;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.NTileStat;
import five.min.markets.entity.StatType;
import five.min.markets.entity.TrendClassification;
import five.min.markets.pool.ObjectPoolFactory;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;
import lombok.extern.slf4j.Slf4j;

@Scope("prototype")
@Slf4j
public class RegressionTrendFeature extends AbstractFeature {

	private NTileStatRepository nTileStatRepository;
	private FeatureType featureType;
	private StatType statType;
	private FeatureType baseFeatureType;
	private Boolean isDownSlope;
	private Integer numTiles;
	public RegressionTrendFeature(
			MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository,
			StatType sourceStat,
			FeatureType featureType,
			FeatureType baseFeatureType,
			ObjectPoolFactory objectPoolFactory) {
		super(marketDataFeatureRepository, objectPoolFactory);
		this.nTileStatRepository = nTileStatRepository;
		this.featureType = featureType;
		this.statType = sourceStat;
		this.baseFeatureType = baseFeatureType;
		this.isDownSlope = (Boolean) featureType.config.get("isDown");
		this.numTiles = (Integer) statType.config.get("tiles");
	}

	@Override
	public MarketDataFeature getFeature(IMarketData marketData) {
		List<NTileStat> nTileStats = nTileStatRepository.findByMarketAndStatType(
				marketData, statType, PageRequest.of(0, numTiles));
		MarketDataFeature regressionFeature = marketDataFeatureRepository
				.findByMarketDataEqualsAndFeatureTypeEquals(marketData.getId(), baseFeatureType);
		if(regressionFeature == null) {
			log.debug("No feature for {} and market data {}", baseFeatureType, marketData.getId());
			return null;
		}
		Double slope = regressionFeature.getDoubleValue();
		if(slope == null) {
			log.debug("No value for feature {} and market data {}", baseFeatureType, marketData.getId());
			return null;
		}
		if(isDownSlope && slope >= 0) {
			log.debug("Slope is positive feature is for down slope");
			return null;
		}
		MarketDataFeature trendFeature = getFeatureFromDb(marketData);
		NTileStat applicable = null;
		for(int i = 0, len = nTileStats.size(); i < len; i++) {
			NTileStat stat = nTileStats.get(i);
			if(slope <= stat.getDoubleValue() || (i+1) == len) {
				applicable = stat;
				break;
			}
		}
		if(applicable == null) {
			log.debug("Applicable stat is null for feature {}, base feature {}, slope {}", 
					featureType, baseFeatureType, slope);
			return null;
		}
		TrendClassification trend = TrendClassification.trend(applicable.getTile(), !isDownSlope);
		trendFeature.setStringValue(trend.name());
		return trendFeature;
	}

	@Override
	public void updateFeature(IMarketData marketData) {
		MarketDataFeature trendFeature = getFeature(marketData);
		if(trendFeature != null) {
			marketDataFeatureRepository.save(trendFeature);
		}
	} 

	@Override
	public FeatureType getFeatureType() {
		return featureType;
	}

	@Override
	public boolean initialise(IMarketData marketData) {
		return true;
	}

}
