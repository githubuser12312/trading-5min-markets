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
@Table(name = "boolean_probability", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"proability_mass_container_id", "prediction_bar_up", "feature_value_last_bar"})
})
@DiscriminatorValue(value = "BOOLEAN")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class BooleanProbabilityMass extends ProbabilityMassData {

	@EqualsAndHashCode.Include
	@Column(nullable = false, name = "feature_value_last_bar")
	private boolean featureValue;
}
