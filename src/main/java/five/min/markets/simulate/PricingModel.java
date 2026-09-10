package five.min.markets.simulate;

import five.min.markets.entity.MarketData;

public interface PricingModel {
    /**
     * Determine the execution price for an entry or exit given the market data.
     * For example: close, open of next bar, mid price, slippage model, etc.
     */
    double determinePrice(MarketData data, PositionType positionType);
    
    int quantity(MarketData data, PositionType positionType, double price);
}
