package five.min.markets.simulate.entity;

import java.time.Instant;
import java.util.Set;

import five.min.markets.entity.Market;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "simulation_run")
@Getter @Setter
public class SimulationRun {


	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	private Instant start = Instant.now();
	private Instant finish;
	@ManyToOne(optional = false)
	@JoinColumn(name = "market_id")
	private Market market;
	@OneToMany(mappedBy = "simulationRun")
	private Set<StrategySummary> strategySummaries;
	@OneToMany(mappedBy = "simulationRun")
	private Set<TradeRecord> tradeRecords;
}
