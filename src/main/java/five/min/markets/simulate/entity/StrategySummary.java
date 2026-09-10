package five.min.markets.simulate.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@Table(name = "strategy_summaries")
@Getter @Setter
public class StrategySummary {

		@Column(name = "id", unique = true)
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Id
		private Integer id;
	    
		@Column(name = "strategy_id", nullable = false)
	    private String strategyId;
		
		@ManyToOne(optional = false)
		@JoinColumn(name = "simulation_run_id")
		private SimulationRun simulationRun;

	    @Column(name = "total_trades", nullable = false)
	    private long totalTrades = 0;

	    @Column(name = "total_wins", nullable = false)
	    private long totalWins = 0;

	    @Column(name = "total_losses", nullable = false)
	    private long totalLosses = 0;

	    @Column(name = "total_pnl", nullable = false)
	    private double totalPnl = 0.0;

	    @Column(name = "gross_profit", nullable = false)
	    private double grossProfit = 0.0;

	    @Column(name = "gross_loss", nullable = false)
	    private double grossLoss = 0.0;

	    @Column(name = "longest_winning_streak", nullable = false)
	    private int longestWinningStreak = 0;

	    @Column(name = "longest_losing_streak", nullable = false)
	    private int longestLosingStreak = 0;

	    @Column(name = "max_drawdown", nullable = false)
	    private double maxDrawdown = 0.0;

	    @Column(name = "current_drawdown", nullable = false)
	    private double currentDrawdown = 0.0;

	    @Column(name = "peak_equity", nullable = false)
	    private double peakEquity = 0.0;

	    @Column(name = "current_equity", nullable = false)
	    private double currentEquity = 0.0;
	    
	    @Column(name = "current_win_streak", nullable = false)
        private int currentWinStreak = 0;
	    
	    @Column(name = "current_loss_streak", nullable = false)
	    private int currentLossStreak = 0;
        
	    public void computeSummaryFromTrades(TradeRecord t) {

	        if (t.getState() != TradeState.CLOSED) return;

            this.totalTrades++;
            double pnl = t.getPnl();
            this.totalPnl += pnl;

            if (pnl > 0) {
            	this.totalWins++;
            	this.grossProfit += pnl;
                currentWinStreak++;
                currentLossStreak = 0;
                this.longestWinningStreak = Math.max(this.longestWinningStreak, currentWinStreak);
            } else if (pnl < 0) {
            	this.totalLosses++;
            	this.grossLoss += -pnl;
                currentLossStreak++;
                currentWinStreak = 0;
                this.longestLosingStreak = Math.max(this.longestLosingStreak, currentLossStreak);
            } else {
                // breakeven: reset both streaks or define your own policy
                currentWinStreak = 0;
                currentLossStreak = 0;
            }

            // Equity curve and drawdown
            this.currentEquity = this.totalPnl;
            if (this.currentEquity > this.peakEquity) {
            	this.peakEquity = this.currentEquity;
            }
            this.currentDrawdown = this.peakEquity - this.currentEquity;
            this.maxDrawdown = Math.max(this.maxDrawdown, this.currentDrawdown);
	    }

}
