package five.min.markets.simulate.pricingmodel.exit;

import five.min.markets.entity.MarketData;
import five.min.markets.simulate.PositionType;
import five.min.markets.simulate.PricingModel;

public class BinaryOptionClosingPricingModel implements PricingModel {

	@Override
	public double determinePrice(MarketData data, PositionType positionType) {
		if(positionType == PositionType.LONG && data.getUp()) return 1.0;
		else if(positionType == PositionType.LONG && !data.getUp()) return 0.0;
		else if(positionType == PositionType.SHORT && data.getUp()) return 0.0;
		else if(positionType == PositionType.SHORT && !data.getUp()) return 0.0;
		else throw new RuntimeException("No matching conditions for binary exit pricing");
	}

	@Override
	public int quantity(MarketData data, PositionType positionType, double price) {
		return 1;
	}

}
