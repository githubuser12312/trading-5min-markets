package five.min.markets.repo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.projection.NTileProjection;

public interface MarketDataFeatureRepository extends JpaRepository<MarketDataFeature, Long> {

	@Query("SELECT f FROM MarketDataFeature f JOIN f.marketData d ON d.id = :marketDataId WHERE f.featureType = :feature")
	MarketDataFeature findByMarketDataEqualsAndFeatureTypeEquals(Integer marketDataId, FeatureType feature);
	
	@Query("SELECT f FROM MarketDataFeature f JOIN f.marketData d ON d.id = :marketDataId")
	List<MarketDataFeature> findByMarketDataEquals(Integer marketDataId);
	
	@Query("""
			SELECT COUNT(*)
			FROM MarketDataFeature f
			JOIN f.marketData d
			WHERE d.market = :#{#market.market}
			AND d.start < :#{#market.start} 
			AND d.start >= :minDateInclusive
			AND f.featureType = :featureType
			AND f.booleanValue = :value
			""")
	Long featurePredictionDenominator(
			MarketData market, 
			FeatureType featureType, 
			Boolean value,
			Instant minDateInclusive
			);

	@Query("""
			SELECT COUNT(*) 
			FROM MarketDataFeature f
			JOIN f.marketData d
			WHERE d.market = :#{#market.market}
			AND d.start < :#{#market.start} 
			AND d.start >= :minDateInclusive
			AND f.featureType = :featureType
			AND d.up = :isUp
			AND f.booleanValue = :featureValue
			""")
	Long featurePredictionNumerator(@Param("market") MarketData market, 
			FeatureType featureType, 
			Boolean isUp, 
			Boolean featureValue,
			Instant minDateInclusive);
	
	@Query("""
			SELECT COUNT(*)
			FROM MarketDataFeature f
			JOIN f.marketData d
			WHERE d.market = :#{#market.market}
			AND d.start < :#{#market.start} 
			AND d.start >= :minDateInclusive
			AND f.featureType = :featureType
			AND f.stringValue = :value
			""")
	Long featurePredictionDenominator(
			MarketData market, 
			FeatureType featureType, 
			String value,
			Instant minDateInclusive);
	
	@Query("""
			SELECT COUNT(*) 
			FROM MarketDataFeature f
			JOIN f.marketData d
			WHERE d.market = :#{#market.market}
			AND d.start < :#{#market.start} 
			AND d.start >= :minDateInclusive
			AND f.featureType = :featureType
			AND d.up = :isUp
			AND f.stringValue = :featureValue
			""")
	Long featurePredictionNumerator(@Param("market") MarketData market, 
			FeatureType featureType, 
			Boolean isUp, 
			String featureValue,
			Instant minDateInclusive);
	
	@Query(value = """
			with double_ntiles as (
				select ntile(:tiles) over (order by double_value) as tile, double_value as val
				from market_data_feature f 
				join market_data d on f.market_data_id = d.id
				join market m on d.internal_market_id = m.id
				where feature_type = :featureType 
				and double_value > 0
				and m.id = :marketId
				and d.start >= :minDateInclusive
				and d.start < :maxDateExclusive
				)
			select tile, avg(val) 
			from double_ntiles
			group by tile
			""", nativeQuery = true)
		List<NTileProjection> calculateNtileProjectionOverFeatureGreaterThan0(
				Integer tiles, 
				FeatureType featureType,
				Integer marketId,
				Instant minDateInclusive,
				Instant maxDateExclusive); 
	
	@Query(value = """
			with double_ntiles as (
				select ntile(:tiles) over (order by double_value) as tile, double_value as val
				from market_data_feature f 
				join market_data d on f.market_data_id = d.id
				join market m on d.internal_market_id = m.id
				where feature_type = :featureType 
				and double_value <= 0
				and m.id = :marketId
				and d.start >= :minDateInclusive
				and d.start < :maxDateExclusive
				)
			select tile, avg(val) 
			from double_ntiles
			group by tile
			""", nativeQuery = true)
		List<NTileProjection> calculateNtileProjectionOverFeatureLessThanOrEqual0(
				Integer tiles, 
				FeatureType featureType,
				Integer marketId,
				Instant minDateInclusive,
				Instant maxDateExclusive); 
	
	@Query("""
			SELECT DISTINCT stringValue
			FROM MarketDataFeature f
			JOIN f.marketData d
			JOIN d.market m
			WHERE f.featureType = :featureType
			AND m = :#{#market.market}
			""")
	Set<String> findFeatureValues(MarketData market, FeatureType featureType);
}
