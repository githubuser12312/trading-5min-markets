package five.min.markets.simulate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.simulate.entity.StrategySummary;

public interface StrategySummaryRepository extends JpaRepository<StrategySummary, Integer> {
}
