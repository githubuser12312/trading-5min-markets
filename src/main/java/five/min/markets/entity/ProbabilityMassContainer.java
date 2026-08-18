package five.min.markets.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "probability_mass", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"internal_market_id", "feature_type"})
})
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ProbabilityMassContainer {

	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "internal_market_id")
	@EqualsAndHashCode.Include
	private Market market;
	@Enumerated
	@Column(name = "feature_type")
	@EqualsAndHashCode.Include
	private FeatureType featureType;
	@OneToMany(mappedBy = "probabilityMassContainer",fetch = FetchType.LAZY)
	private Set<ProbabilityMassData> probabilityMassData;
	
	
}
