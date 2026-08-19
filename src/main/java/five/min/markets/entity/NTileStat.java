package five.min.markets.entity;

import org.hibernate.annotations.Collate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "ntile_stat", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"internal_market_id", "stat_type", "tile"})
})
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true, callSuper = true)
public class NTileStat extends MarketStat {

	@EqualsAndHashCode.Include
	private Integer tile;
	@Column(name = "double_value")
	private Double doubleValue;
	
	public NTileStat() {
		// TODO Auto-generated constructor stub
	}

}
