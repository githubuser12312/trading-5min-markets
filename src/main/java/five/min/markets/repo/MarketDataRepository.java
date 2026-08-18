package five.min.markets.repo;

import java.time.Instant;
import java.util.Set;

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
	
	MarketData findByMarketEqualsAndStartEquals(Market market, Instant start);
	
	@Query("""
			SELECT COUNT(*) 
			FROM MarketData d 
			JOIN d.features f 
			WHERE d.market = :market 
			AND f.featureType = :featureType
			AND d.up = :up
			AND f.booleanValue = :featureValue
			""")
	Long countByUpAndFeatureAndFeatureBooleanValue(@Param("market") Market market, 
			@Param("featureType") FeatureType featureType, 
			@Param("up") Boolean isUp, 
			@Param("featureValue") Boolean featureValue);
}
