package five.min.markets.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
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
	
	@OneToMany(mappedBy = "market", fetch = FetchType.LAZY)
	private Set<MarketData> marketData;
	
}
