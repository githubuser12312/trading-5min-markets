package five.min.markets.simulate.strategy;

import java.util.Optional;

import org.springframework.stereotype.Component;

import five.min.markets.entity.MarketData;
import five.min.markets.simulate.EntrySignal;
import five.min.markets.simulate.ExitSignal;
import five.min.markets.simulate.PositionType;
import five.min.markets.simulate.PricingModel;
import five.min.markets.simulate.SimulationContext;
import five.min.markets.simulate.Strategy;
import five.min.markets.simulate.entity.TradeRecord;
import five.min.markets.simulate.pricingmodel.entry.BinaryOptionOpeningPricingModel;
import five.min.markets.simulate.pricingmodel.exit.BinaryOptionClosingPricingModel;

@Component
public class AlwaysUpBinaryOptionStrategy implements Strategy {

	private String name = getClass().getSimpleName(); 
	private EntrySignal entrySignal;
	private ExitSignal exitSignal;
	private PricingModel entryPrice = new BinaryOptionOpeningPricingModel();
	private PricingModel exitPrice = new BinaryOptionClosingPricingModel();
	public AlwaysUpBinaryOptionStrategy() {
		this.entrySignal = new EntrySignal(name, PositionType.LONG);
		this.exitSignal = new ExitSignal();
	}
	
	@Override
	public String id() {
		return name;
	}

	@Override
	public Optional<EntrySignal> evaluate(MarketData data, SimulationContext context) {
		return Optional.of(entrySignal);
	}

	@Override
	public Optional<ExitSignal> evaluateExit(TradeRecord trade, MarketData data, SimulationContext context) {
		return Optional.of(exitSignal);
	}

	@Override
	public PricingModel entryPricing() {
		return entryPrice;
	}

	@Override
	public PricingModel exitPricing() {
		return exitPrice;
	}

}
