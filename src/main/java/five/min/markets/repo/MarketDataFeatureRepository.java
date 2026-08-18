package five.min.markets.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;

public interface MarketDataFeatureRepository extends JpaRepository<MarketDataFeature, Long> {

	MarketDataFeature findByMarketDataEqualsAndFeatureTypeEquals(MarketData data, FeatureType feature);
	
	@Query("""
			SELECT COUNT(*)
			FROM MarketDataFeature f
			JOIN f.marketData d
			join d.market m
			WHERE m = :market
			AND f.featureType = :featureType
			AND f.booleanValue = :value
			""")
	Long countByMarketAndFeatureTypeAndBooleanValue(
			@Param("market") Market market, 
			@Param("featureType") FeatureType featureType, 
			@Param("value") Boolean value);
}
