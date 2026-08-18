package five.min.markets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@DiscriminatorColumn(name = "feature_type", discriminatorType = DiscriminatorType.STRING)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public  abstract class ProbabilityMassData {
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Id
	private Integer id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "proability_mass_container_id")
	@EqualsAndHashCode.Include
	private ProbabilityMassContainer probabilityMassContainer;
	private Long denominator;
	private Long numerator;
	private Double probability;
	
	@PreUpdate
	@PrePersist
	public void updateProbability() {
		if(denominator == 0 || numerator == null || denominator == null) return;
		probability = (numerator * 1.0) / denominator;
	}
}
