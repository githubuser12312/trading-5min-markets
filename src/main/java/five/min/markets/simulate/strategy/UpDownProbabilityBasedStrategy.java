package five.min.markets.simulate.strategy;

import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.stereotype.Component;

import five.min.markets.bayes.BernoulliBayesModel;
import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.entity.ProbabilityMassData;
import five.min.markets.entity.StringProbabilityMass;
import five.min.markets.repo.BooleanProbabilityMassRepository;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.ProbabilityMassDataRepository;
import five.min.markets.repo.StringProbabilityMassRepository;
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
public class UpDownProbabilityBasedStrategy implements Strategy {

	private String name = getClass().getSimpleName();
	private ProbabilityMassContainerRepository probabilityMassContainerRepository;
	private BooleanProbabilityMassRepository booleanProbabilityMassRepository;
	private StringProbabilityMassRepository stringProbabilityMassRepository;
	private MarketDataFeatureRepository marketDataFeatureRepository;
	private ExitSignal exitSignal;
	private EntrySignal longEntrySignal;
	private EntrySignal shortEntrySignal;
	private BinaryOptionOpeningPricingModel binaryOptionOpeningPricingModel = new BinaryOptionOpeningPricingModel();
	private BinaryOptionClosingPricingModel binaryOptionClosingPricingModel = new BinaryOptionClosingPricingModel();
	public UpDownProbabilityBasedStrategy(ProbabilityMassContainerRepository probabilityMassContainerRepository,
			BooleanProbabilityMassRepository booleanProbabilityMassRepository,
			StringProbabilityMassRepository stringProbabilityMassRepository,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		this.longEntrySignal = new EntrySignal(name, PositionType.LONG);
		this.shortEntrySignal = new EntrySignal(name, PositionType.SHORT);
		this.exitSignal = new ExitSignal();
		this.probabilityMassContainerRepository = probabilityMassContainerRepository;
		this.booleanProbabilityMassRepository = booleanProbabilityMassRepository;
		this.stringProbabilityMassRepository = stringProbabilityMassRepository;
		this.marketDataFeatureRepository = marketDataFeatureRepository;
	}
	
	@Override
	public String id() {
		return name;
	}
	
	private MarketDataFeature hasFeature(List<MarketDataFeature> features, ProbabilityMassContainer probabilityMassContainer) {
		if(features == null || features.isEmpty() || probabilityMassContainer == null) return null;
		return features.stream()
				.filter(f -> f.getFeatureType() == probabilityMassContainer.getFeatureType())
				.filter(f -> f.getBooleanValue() != null || f.getStringValue() != null || f.getDoubleValue() != null || f.getIntegerValue() != null)
				.findFirst().orElse(null);
	}
	
	private double findProbabilityMassDataProbability(ProbabilityMassContainer probabilityMassContainer, MarketDataFeature features) {
		ProbabilityMassData probabilityMassData = null;
		if(features.getBooleanValue() != null) {
			probabilityMassData = booleanProbabilityMassRepository.findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(probabilityMassContainer, true, features.getBooleanValue());
		} else if(features.getStringValue() != null) {
			probabilityMassData = stringProbabilityMassRepository.findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(probabilityMassContainer, true, features.getStringValue());
		} else {
			return -1.0;
		}
		if(probabilityMassData == null) {
			return  -1.0;
		}
		
		double probability = probabilityMassData.getProbability();
		if(probability >= 0 && probability <= 1.0) return probability;
		return -1.0;
	}

	@Override
	public Optional<EntrySignal> evaluate(MarketData data, SimulationContext context) {
		BernoulliBayesModel bernoulliBayesModel = new BernoulliBayesModel(0.5);
		List<MarketDataFeature> features = marketDataFeatureRepository.findByMarketDataEquals(data);
		List<ProbabilityMassContainer> probabilityMassContainers = probabilityMassContainerRepository.latestProbabilityMassContainers();
		for(ProbabilityMassContainer probabilityMassContainer : probabilityMassContainers) {
			MarketDataFeature applicable = hasFeature(features, probabilityMassContainer);
			if(applicable != null) {
				double probability = findProbabilityMassDataProbability(probabilityMassContainer, applicable);
				if(probability < 0) continue;
				bernoulliBayesModel.addProbability(probability);
			}
		}
		EntrySignal entrySignal = null;
		double posterior = bernoulliBayesModel.getPosterior();
		if(posterior > 0.51) {
			entrySignal = longEntrySignal;
		} else if(posterior < 0.49) {
			entrySignal = shortEntrySignal;
		}
		
		return Optional.ofNullable(entrySignal);
	}

	@Override
	public Optional<ExitSignal> evaluateExit(TradeRecord trade, MarketData data, SimulationContext context) {
		return Optional.of(exitSignal);
	}

	@Override
	public PricingModel entryPricing() {
		return binaryOptionOpeningPricingModel;
	}

	@Override
	public PricingModel exitPricing() {
		return binaryOptionClosingPricingModel;
	}

}
