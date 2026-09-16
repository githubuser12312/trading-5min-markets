package five.min.markets.repo;

import java.time.Instant;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.IMarketData;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.NTileStat;
import five.min.markets.entity.StatType;
import org.springframework.data.jpa.repository.Query;

public interface NTileStatRepository extends JpaRepository<NTileStat, Integer> {

	@Query("""
			SELECT n FROM NTileStat n 
			WHERE n.market = :market
			AND n.statType = :statType 
			AND n.tile = :tiles 
			ORDER BY n.market.start DESC""")
	List<NTileStat> findByMarketAndStatTypeAndTile(MarketData market, StatType statType, Integer tiles, Pageable page);
	
	@Query("""
			SELECT n FROM NTileStat n 
			WHERE n.market.market.code = :#{#market.getCode()}
			AND n.market.market.period = :#{#market.getPeriod()}
			AND n.market.market.source = :#{#market.getSource()}
			AND n.market.start < :#{#market.getStart()} 
			AND n.statType = :statType
			ORDER BY n.market.start DESC, n.tile ASC""")
	List<NTileStat> findByMarketAndStatType(IMarketData market, StatType statType, Pageable page);
	
	@Query("""
			SELECT MAX(d.start)
			FROM NTileStat s
			JOIN s.market d
			JOIN d.market m
			WHERE m = :#{#marketData.market}
			AND s.statType = :statType
			""")
	Instant getMaxMarketDataStatDate(MarketData marketData, StatType statType);
}
