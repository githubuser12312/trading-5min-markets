package five.min.markets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "bar_before_probability", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"proability_mass_container_id", "last_bar_up", "current_bar_up"})
})
@DiscriminatorValue(value = "LAST_BAR_UP")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class BarBeforeProbabilityMass extends ProbabilityMassData {

	@EqualsAndHashCode.Include
	@Column(nullable = false, name = "last_bar_up")
	private boolean lastBarUp;
	@EqualsAndHashCode.Include
	@Column(nullable = false, name = "current_bar_up")
	private boolean currentBarUp;
}
