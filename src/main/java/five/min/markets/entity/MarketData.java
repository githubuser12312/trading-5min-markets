package five.min.markets.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.Set;

import org.hibernate.annotations.Generated;
import org.hibernate.generator.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "market_data", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"start", "internal_market_id"})
})
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MarketData {

	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "internal_market_id")
	@EqualsAndHashCode.Include
	private Market market;
	@Column(name = "start", nullable = false, secondPrecision = 6)
	@EqualsAndHashCode.Include
	private Instant start;
	@Column(name = "open", columnDefinition = "decimal(36, 18)", nullable = false)
	private BigDecimal open;
	@Column(name = "high", columnDefinition = "decimal(36, 18)", nullable = false)
	private BigDecimal high;
	@Column(name = "low", columnDefinition = "decimal(36, 18)", nullable = false)
	private BigDecimal low;
	@Column(name = "close", columnDefinition = "decimal(36, 18)", nullable = false)
	private BigDecimal close;
	@Column(name = "volume", columnDefinition = "decimal(36, 18)", nullable = false)
	private BigDecimal volume;
	@Column(name = "up", columnDefinition = "boolean", nullable = false)
	private Boolean up;
	@Column(name = "percent", columnDefinition = "decimal(36,18)")
	private BigDecimal percent;
	@OneToMany(mappedBy = "marketData")
	private Set<MarketDataFeature> features;
	
	
	public void setDirection() {
		if(open.compareTo(close) >= 0) {
			up = Boolean.FALSE;
		}
		else {
			up = Boolean.TRUE;
		}
	}
	
	public void setPercent() {
		this.percent = close.subtract(open).divide(open, RoundingMode.HALF_DOWN).setScale(6, RoundingMode.HALF_DOWN);
	}
}
