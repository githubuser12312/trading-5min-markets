package five.min.markets.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.projection.NTileProjection;

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
	
	@Query(value = """
			with double_ntiles as (
				select ntile(:tiles) over (order by double_value) as tile, double_value as val
				from market_data_feature f 
				join market_data d on f.market_data_id = d.id
				join market m on d.internal_market_id = m.id
				where feature_type = :featureType 
				and double_value > 0
				and m.id = :marketId
				)
			select tile, avg(val) 
			from double_ntiles
			group by tile
			""", nativeQuery = true)
		List<NTileProjection> calculateNtileProjectionOverFeatureGreaterThan0(
				@Param("tiles") Integer numTiles, 
				@Param("featureType") FeatureType featureType,
				@Param("marketId") Integer marketId); 
	
	@Query(value = """
			with double_ntiles as (
				select ntile(:tiles) over (order by double_value) as tile, double_value as val
				from market_data_feature f 
				join market_data d on f.market_data_id = d.id
				join market m on d.internal_market_id = m.id
				where feature_type = :featureType 
				and double_value <= 0
				and m.id = :marketId
				)
			select tile, avg(val) 
			from double_ntiles
			group by tile
			""", nativeQuery = true)
		List<NTileProjection> calculateNtileProjectionOverFeatureLessThanOrEqual0(
				@Param("tiles") Integer numTiles, 
				@Param("featureType") FeatureType featureType,
				@Param("marketId") Integer marketId); 
}
