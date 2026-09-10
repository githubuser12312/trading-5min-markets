package five.min.markets.stat;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.List;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.StatType;
import five.min.markets.entity.projection.NTileProjection;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;

public class FeatureTypeGreaterThanZeroNTileStat extends FeatureTypeNtileStat {

	public FeatureTypeGreaterThanZeroNTileStat(StatType statType,
			MarketDataFeatureRepository marketDataFeatureRepository, NTileStatRepository nTileStatRepository) {
		super(statType, marketDataFeatureRepository, nTileStatRepository);
	}

	@Override
	List<NTileProjection> getTilesProjection(MarketData marketData) {
		Instant minDateInclusive =marketData.getMarket().getLookBackDateInclusive(marketData);
		return marketDataFeatureRepository.calculateNtileProjectionOverFeatureGreaterThan0(
				tiles, featureType, marketData.getMarket().getId(), minDateInclusive, marketData.getStart());
	}

}
