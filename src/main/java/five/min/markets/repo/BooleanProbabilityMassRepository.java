package five.min.markets.repo;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.ProbabilityMassContainer;

public interface BooleanProbabilityMassRepository extends JpaRepository<BooleanProbabilityMass, Integer> {

	BooleanProbabilityMass findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(
			ProbabilityMassContainer probabilityMassContainer,
			Boolean lastBarUp,
			Boolean currentBarUp);

}
