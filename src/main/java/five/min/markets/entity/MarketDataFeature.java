package five.min.markets.entity;

import five.min.markets.pool.Poolable;
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
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "market_data_feature", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"market_data_id", "feature_type"})
})
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class MarketDataFeature implements Poolable {

	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	@ManyToOne(optional = false)
	@JoinColumn(name = "market_data_id")
	private MarketData marketData;
	@Column(name = "feature_type", nullable = false)
	@Enumerated(EnumType.ORDINAL)
	private FeatureType featureType;
	private Integer integerValue = null;
	private Double doubleValue = null;
	private Boolean booleanValue = null;
	private String stringValue = null;
	
	public void reset() {
		integerValue = null;
		doubleValue = null;
		booleanValue = null;
		stringValue = null;
		featureType = null;
		marketData = null;
	}
}
