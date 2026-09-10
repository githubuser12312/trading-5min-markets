package five.min.markets.repo;

import java.time.Instant;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.ProbabilityMassContainer;

public interface ProbabilityMassContainerRepository extends JpaRepository<ProbabilityMassContainer, Integer> {

	ProbabilityMassContainer findByMarketEqualsAndFeatureTypeEquals(MarketData market, FeatureType featureType);
	
	@Query("""
			SELECT MAX(d.start)
			FROM ProbabilityMassContainer c
			JOIN c.market d
			JOIN d.market m
			WHERE m = :#{#market.market}
			AND c.featureType = :featureType 
			""")
	Instant getMaxMarketDataStartDate(MarketData market, FeatureType featureType);
	
	
	@Query(value="""
			select distinct m.* 
			from probability_mass m 
			join market_data d on m.internal_market_id = 
				(select m.internal_market_id 
				from probability_mass m 
				join market_data d on m.internal_market_id 
				where d.start < :#{#marketData.start} order by d.start desc limit 1); 
			""", nativeQuery = true)
	List<ProbabilityMassContainer> findProbabilityMassApplicableAt(MarketData marketData);
	
	@Cacheable("latestPmc")
	@Query(value="""
			select distinct m.* 
			from probability_mass m 
			join market_data d on m.internal_market_id = 
				(select m.internal_market_id 
				from probability_mass m 
				join market_data d on m.internal_market_id
				order by d.start desc limit 1); 
			""", nativeQuery = true)
	List<ProbabilityMassContainer> latestProbabilityMassContainers();
	
}
