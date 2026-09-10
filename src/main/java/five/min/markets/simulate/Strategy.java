package five.min.markets.simulate;

import java.util.Optional;

import five.min.markets.entity.MarketData;
import five.min.markets.simulate.entity.TradeRecord;

public interface Strategy {
	String id(); // unique strategy identifier

    /**
     * Evaluate the market data and optionally request a new entry.
     * Returns Optional.empty() if no entry is desired.
     */
    Optional<EntrySignal> evaluate(MarketData data, SimulationContext context);

    /**
     * Decide whether to close an existing open trade given new market data.
     * Returns Optional.empty() if the trade should remain open.
     */
    Optional<ExitSignal> evaluateExit(TradeRecord trade, MarketData data, SimulationContext context);

    /**
     * Pricing model used to determine entry prices.
     */
    PricingModel entryPricing();

    /**
     * Pricing model used to determine exit prices.
     */
    PricingModel exitPricing();
}
