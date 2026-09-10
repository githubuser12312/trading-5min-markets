package five.min.markets.entity;

import java.io.Serializable;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.UpdateTimestamp;
import org.hibernate.generator.EventType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "market", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"code", "source", "market_period"})
})
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Market {

	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@Column(name = "code", columnDefinition = "varchar(20)", nullable = false)
	@EqualsAndHashCode.Include
	private String code;
	@Column(name = "source", columnDefinition = "varchar(20)", nullable = false)
	@EqualsAndHashCode.Include
	@Enumerated(EnumType.STRING)
	private Source source;
	@CreationTimestamp
	@Column(name = "created")
	private LocalDateTime created;
	@UpdateTimestamp
	@Column(name = "updated")
	private LocalDateTime updated;
	@Column(name = "market_period", columnDefinition = "varchar(20)", nullable = false)
	@Enumerated(EnumType.STRING)
	@EqualsAndHashCode.Include
	private Period period;
	@Column(name = "aggregation_period", columnDefinition = "varchar(20)", nullable = false)
	@Enumerated(EnumType.STRING)
	private DataAggregationPeriod dataAggregationPeriod = DataAggregationPeriod.WEEKLY;
	private java.time.Period dataAggregationLookbackPeriod = java.time.Period.of(0, 6, 0); 
	
	@OneToMany(mappedBy = "market", fetch = FetchType.LAZY)
	private Set<MarketData> marketData;
	
	public boolean isAggregationNow(MarketData marketData) {
		LocalDateTime candleStart = LocalDateTime.ofInstant(marketData.getStart(), ZoneId.systemDefault());
		boolean isStartOfDay = candleStart.getHour() == 0 && candleStart.getMinute() == 0 && candleStart.getSecond() == 0;
		boolean isStartOfWeek = candleStart.getDayOfWeek() == DayOfWeek.MONDAY;
		boolean isStartOfMonth = candleStart.getDayOfMonth() == 1;
		switch (dataAggregationPeriod) {
		case DAILY: {
			return isStartOfDay;
		}
		case WEEKLY : {
			return isStartOfDay && isStartOfWeek;
		}
		case MONTHLY: {
			return isStartOfDay && isStartOfMonth;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + dataAggregationPeriod);
		}
	}
	
	public Instant getLookBackDateInclusive(MarketData marketData) {
		if(dataAggregationLookbackPeriod == null) {
			dataAggregationLookbackPeriod = java.time.Period.of(20, 0, 0);
		}
		return LocalDateTime.ofInstant(marketData.getStart(), ZoneId.systemDefault())
				.minus(dataAggregationLookbackPeriod).toInstant(ZoneOffset.UTC);
	}
}
