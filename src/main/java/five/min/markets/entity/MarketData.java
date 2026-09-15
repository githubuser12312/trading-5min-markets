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
import lombok.ToString;

@Entity
@Table(name = "market_data", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"start", "internal_market_id"})
})
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MarketData implements IMarketData {

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
	private double open;
	@Column(name = "high", columnDefinition = "decimal(36, 18)", nullable = false)
	private double high;
	@Column(name = "low", columnDefinition = "decimal(36, 18)", nullable = false)
	private double low;
	@Column(name = "close", columnDefinition = "decimal(36, 18)", nullable = false)
	private double close;
	@Column(name = "volume", columnDefinition = "decimal(36, 18)", nullable = false)
	private double volume;
	@Column(name = "up", columnDefinition = "boolean", nullable = false)
	private Boolean up;
	@Column(name = "percent", columnDefinition = "decimal(36,18)")
	private double percent;
	@OneToMany(mappedBy = "marketData")
	private Set<MarketDataFeature> features;
	
	
	public void setDirection() {
		if(open <= close) {
			up = Boolean.FALSE;
		}
		else {
			up = Boolean.TRUE;
		}
	}
	
	public void setPercent() {
		this.percent = (close - open) / open;
	}
	
	public void reset() {
		this.id = null;
		this.market = null;
		this.start = null;
		this.open = 0.0;
		this.high = 0.0;
		this.low = 0.0;
		this.close = 0.0;
		this.volume = 0.0;
		this.up = null;
		this.percent = 0.0;
		this.features = null;
	}

	@Override
	public String getCode() {
		if(market == null) return null;
		return market.getCode();
	}

	@Override
	public Period getPeriod() {
		if(market == null) return null;
		return market.getPeriod();
	}

	@Override
	public Source getSource() {
		if(market == null) return null;
		return market.getSource();
	}
}
