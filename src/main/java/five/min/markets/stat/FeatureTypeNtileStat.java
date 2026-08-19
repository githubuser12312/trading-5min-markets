package five.min.markets.stat;

import java.util.Collection;
import java.util.List;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
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
	private NTileStatRepository nTileStatRepository;
	
	public FeatureTypeNtileStat(StatType statType, 
			MarketDataFeatureRepository marketDataFeatureRepository,
			NTileStatRepository nTileStatRepository) {
		super(statType);
		this.featureType = (FeatureType) statType.config.get("feature");
		this.tiles = (Integer) statType.config.get("tiles");
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.nTileStatRepository = nTileStatRepository;
	}
	
	abstract List<NTileProjection> getTilesProjection(Market market);

	@Override
	public void calculateStat(Market market) {
		List<NTileProjection> nTiles = getTilesProjection(market);
		projectionToStatAndSave(market, nTiles);
	}
	
	private void projectionToStatAndSave(Market market, Collection<NTileProjection> data) {
		data.forEach(d -> {
			NTileStat stat = getStat(market, d);
			stat.setDoubleValue(d.value());
			nTileStatRepository.save(stat);
		});
	}

	private NTileStat getStat(Market market, NTileProjection nTileProjection) {
		NTileStat stat = nTileStatRepository.findByMarketAndStatTypeAndTile(market, 
				getStatType(), nTileProjection.tile().intValue());
		if(stat == null) {
			stat = new NTileStat();
			stat.setMarket(market);
			stat.setStatType(getStatType());
			stat.setTile(nTileProjection.tile().intValue());
		}
		return stat;
	}
	
}
