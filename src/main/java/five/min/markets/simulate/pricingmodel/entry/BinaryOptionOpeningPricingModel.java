package five.min.markets.simulate.pricingmodel.entry;

import five.min.markets.entity.MarketData;
import five.min.markets.simulate.PositionType;
import five.min.markets.simulate.PricingModel;

public class BinaryOptionOpeningPricingModel implements PricingModel {

	@Override
	public double determinePrice(MarketData data, PositionType positionType) {
		return 0.51;
	}

	@Override
	public int quantity(MarketData data, PositionType positionType, double price) {
		return 1;
	}

}
