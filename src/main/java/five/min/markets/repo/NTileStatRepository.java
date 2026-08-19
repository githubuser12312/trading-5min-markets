package five.min.markets.repo;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.Market;
import five.min.markets.entity.NTileStat;
import five.min.markets.entity.StatType;

public interface NTileStatRepository extends JpaRepository<NTileStat, Integer> {

	NTileStat findByMarketAndStatTypeAndTile(Market market, StatType statType, Integer tiles);
	
	List<NTileStat> findByMarketAndStatType(Market market, StatType statType, Sort sort);
}
