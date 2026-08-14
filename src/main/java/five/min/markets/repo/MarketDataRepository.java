package five.min.markets.repo;

import java.time.Instant;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;

public interface MarketDataRepository extends JpaRepository<MarketData, Integer> {

	Set<MarketData> findByMarketEquals(Market market);
	
	MarketData findByMarketEqualsAndStartEquals(Market market, Instant start);
}
