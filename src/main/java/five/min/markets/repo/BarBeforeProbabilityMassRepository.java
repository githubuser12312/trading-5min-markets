package five.min.markets.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.BarBeforeProbabilityMass;
import five.min.markets.entity.ProbabilityMassContainer;

public interface BarBeforeProbabilityMassRepository extends JpaRepository<BarBeforeProbabilityMass, Integer> {

	BarBeforeProbabilityMass findByProbabilityMassContainerEqualsAndLastBarUpEqualsAndCurrentBarUpEquals(
			ProbabilityMassContainer probabilityMassContainer,
			Boolean lastBarUp,
			Boolean currentBarUp);
}
