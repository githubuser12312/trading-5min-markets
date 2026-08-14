package five.min.markets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "market_data_feature")
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MarketDataFeature {

	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "market_data_id")
	private MarketData marketData;
	@Column(name = "feature_type", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private FeatureType featureType;
	private Integer integerValue;
	private Double doubleValue;
	private Boolean booleanValue;
	private String stringValue;
}
