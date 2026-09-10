package five.min.markets.simulate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.simulate.entity.SimulationRun;

public interface SimulationRunRepository extends JpaRepository<SimulationRun, Integer> {

}
