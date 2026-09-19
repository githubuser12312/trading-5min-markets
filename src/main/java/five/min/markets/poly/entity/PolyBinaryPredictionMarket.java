package five.min.markets.poly.entity;

import java.sql.Types;
import java.time.Instant;

import org.hibernate.annotations.JdbcType;
import org.hibernate.annotations.JdbcTypeCode;

import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
@Entity
@Table(name = "poly_binary_prediction_market", uniqueConstraints = {
		@UniqueConstraint(columnNames = {"start_epoch_seconds", "period", "code"})
})
@Getter @Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class PolyBinaryPredictionMarket {
	@Column(name = "id", unique = true)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer id;
	@Column(nullable =  false, name = "start_epoch_seconds")
	private Long startEpochSeconds;
	@Column(nullable =  false, name = "start_epoch_seconds_millis")
	private Long startEpochSecondsMillis;
	@Column(nullable = false)
	private Instant start;
	@Column(nullable = false)
	private Instant end;
	@Column(unique = true, nullable = false)
	@EqualsAndHashCode.Include
	private String slug;
	@Column(unique = true, name ="ploy_id", nullable = false)
	private Long polyId;
	@Column(name = "min_order_size", nullable = false)
	private Double minOrderSize;
	@Column(name = "up_clob_token_id", nullable = false)
	private String upClobTokenId;
	@Column(name = "down_clob_token_id", nullable = false)
	private String downClobTokenId;
	@Column(name = "accepting_orders", nullable = false)
	private Boolean acceptingOrders;
	@Column(name = "order_price_min_tick_size", nullable = false)
	private double orderPriceMinTickSize;
	@Column(nullable = false)
	private String ticker;
	@Column(nullable = false)
	private String title;
	@Column(nullable = false)
	private String seriesSlug;
	@Column(nullable = false)
	private Boolean active;
	@Column(nullable = false)
	private Period period;
	@Column(nullable = false)
	private String code;
	@Column(nullable = false, name = "market_json", columnDefinition = "text")
	private String marketJson;
	
	
	
}
