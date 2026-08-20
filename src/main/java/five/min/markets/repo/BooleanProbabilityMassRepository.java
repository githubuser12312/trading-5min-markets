package five.min.markets.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.ProbabilityMassContainer;

public interface BooleanProbabilityMassRepository extends JpaRepository<BooleanProbabilityMass, Integer> {

	BooleanProbabilityMass findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(
			ProbabilityMassContainer probabilityMassContainer,
			Boolean lastBarUp,
			Boolean currentBarUp);
}
