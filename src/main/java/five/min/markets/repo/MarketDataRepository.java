package five.min.markets.repo;

import java.time.Instant;
import java.util.List;
import java.util.Set;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;

@Repository
public interface MarketDataRepository extends JpaRepository<MarketData, Integer> {

	Set<MarketData> findByMarketEquals(Market market);
	
	Page<MarketData> findByMarketEquals(Market market, Pageable pageable);
	
	Slice<MarketData> findByMarketEqualsAndStartGreaterThan(Market market, Instant after, Pageable pageable);
	
	MarketData findByMarketEqualsAndStartEquals(Market market, Instant start);
	
	@Query("SELECT MAX(d.start) FROM MarketData d JOIN d.market m ON m = :market")
	Instant findLatestMarketDataForMarket(Market market);
	
	@Query("""
			SELECT m FROM MarketData m
			WHERE m.market = :#{#marketData.market}
			AND m.start < :#{#marketData.start}
			ORDER BY m.start DESC
			""")
	List<MarketData> findBarsBefore(MarketData marketData, Pageable pageable);
}
