package five.min.markets.stat;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.List;

import org.springframework.data.domain.PageRequest;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.NTileStat;
import five.min.markets.entity.StatType;
import five.min.markets.entity.projection.NTileProjection;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.NTileStatRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class FeatureTypeNtileStat extends AbstractCalculateStat {

	protected FeatureType featureType;
	protected Integer tiles;
	protected MarketDataFeatureRepository marketDataFeatureRepository;
	protected NTileStatRepository nTileStatRepository;
	
	public FeatureTypeNtileStat(StatType statType, 
			MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		super(statType);
		this.featureType = (FeatureType) statType.config.get("feature");
		this.tiles = (Integer) statType.config.get("tiles");
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.nTileStatRepository = nTileStatRepository;
	}
	
	abstract List<NTileProjection> getTilesProjection(MarketData marketData);

	@Override
	public void calculateStat(MarketData marketData) {
		List<NTileProjection> nTiles = getTilesProjection(marketData);
		projectionToStatAndSave(marketData, nTiles);
	}
	
	private void projectionToStatAndSave(MarketData marketData, Collection<NTileProjection> data) {
		data.forEach(d -> {
			NTileStat stat = getStat(marketData, d);
			stat.setDoubleValue(d.value());
			nTileStatRepository.save(stat);
		});
	}

	private NTileStat getStat(MarketData market, NTileProjection nTileProjection) {
		List<NTileStat> stats = nTileStatRepository.findByMarketAndStatTypeAndTile(market, 
				getStatType(), nTileProjection.tile().intValue(), PageRequest.of(0, 1));
		NTileStat stat = stats.isEmpty() ? null : stats.get(0);
		if(stat == null) {
			stat = new NTileStat();
			stat.setMarket(market);
			stat.setStatType(getStatType());
			stat.setTile(nTileProjection.tile().intValue());
		}
		return stat;
	}
	
}
