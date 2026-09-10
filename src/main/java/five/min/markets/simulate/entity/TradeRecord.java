package five.min.markets.simulate.entity;

import java.time.Instant;

import five.min.markets.entity.MarketData;
import five.min.markets.simulate.PositionType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "trade_records")
@Getter @Setter
public class TradeRecord {

	    @Id
	    @Column(name = "trade_id")
	    private String tradeId;

	    @Column(name = "strategy_id", nullable = false)
	    private String strategyId;
	    
		@ManyToOne(optional = false)
		@JoinColumn(name = "simulation_run_id")
		private SimulationRun simulationRun;

		@ManyToOne(optional = false)
		@JoinColumn(name = "entry_market_data_id")
	    private MarketData entryMarketDataId;

		@ManyToOne(optional = true)
		@JoinColumn(name = "exit_market_data_id")
	    private MarketData exitMarketDataId;

	    @Enumerated(EnumType.STRING)
	    @Column(name = "position_type", nullable = false)
	    private PositionType positionType;

	    @Column(name = "quantity", nullable = false)
	    private int quantity;

	    @Column(name = "entry_price", nullable = false)
	    private double entryPrice;

	    @Column(name = "exit_price")
	    private Double exitPrice; // null while open

	    @Column(name = "pnl")
	    private Double pnl; // null while open
	    
	    @Enumerated(EnumType.STRING)
	    @Column(name = "state", nullable = false)
	    private TradeState state;
	    
	    public void markClosed(MarketData exit, double exitPrice, double pnl) {
	        this.exitMarketDataId = exit;
	        this.exitPrice = exitPrice;
	        this.pnl = pnl;
	        this.state = TradeState.CLOSED;
	    }
}
