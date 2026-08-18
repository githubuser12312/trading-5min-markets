package five.min.markets.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.ProbabilityMassContainer;

public interface ProbabilityMassContainerRepository extends JpaRepository<ProbabilityMassContainer, Integer> {

	ProbabilityMassContainer findByMarketEqualsAndFeatureTypeEquals(Market market, FeatureType featureType);
}
