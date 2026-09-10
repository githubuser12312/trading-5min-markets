package five.min.markets.repo;

import java.util.List;
import java.util.Set;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.entity.ProbabilityMassData;

public interface ProbabilityMassDataRepository extends JpaRepository<ProbabilityMassData, Integer> {

	@Cacheable("pmd")
	List<ProbabilityMassData> findByProbabilityMassContainerEqualsAndLastBarBooleanIsTrue(ProbabilityMassContainer probabilityMassContainer);
	
}
