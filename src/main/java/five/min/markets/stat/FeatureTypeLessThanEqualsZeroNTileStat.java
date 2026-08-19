package five.min.markets.stat;

import java.util.List;

import five.min.markets.entity.Market;
import five.min.markets.entity.StatType;
import five.min.markets.entity.projection.NTileProjection;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;

public class FeatureTypeLessThanEqualsZeroNTileStat extends FeatureTypeNtileStat {

	public FeatureTypeLessThanEqualsZeroNTileStat(StatType statType,
			MarketDataFeatureRepository marketDataFeatureRepository, NTileStatRepository nTileStatRepository) {
		super(statType, marketDataFeatureRepository, nTileStatRepository);
	}

	@Override
	List<NTileProjection> getTilesProjection(Market market) {
		return marketDataFeatureRepository.calculateNtileProjectionOverFeatureLessThanOrEqual0(
				tiles, featureType, market.getId());
	}

}
