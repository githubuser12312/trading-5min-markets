package five.min.markets.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class MarketStat {

	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.TABLE)
	@Id
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "internal_market_id")
	@EqualsAndHashCode.Include
	private Market market;
	@Enumerated
	@Column(name = "stat_type")
	@EqualsAndHashCode.Include
	private StatType statType;
	
	public MarketStat() {
		// TODO Auto-generated constructor stub
	}

}
