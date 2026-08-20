package five.min.markets.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.entity.StringProbabilityMass;

public interface StringProbabilityMassRepository extends JpaRepository<StringProbabilityMass, Integer> {

	StringProbabilityMass findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(
			ProbabilityMassContainer probabilityMassContainer,
			Boolean lastBarUp,
			String featureValue);
}
