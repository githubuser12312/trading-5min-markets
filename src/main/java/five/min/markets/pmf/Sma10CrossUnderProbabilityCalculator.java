package five.min.markets.pmf;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.repo.BooleanProbabilityMassRepository;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;

@Component
public class Sma10CrossUnderProbabilityCalculator extends AbstractBooleanProbabilityCalculator {

	public Sma10CrossUnderProbabilityCalculator(MarketDataRepository marketDataRepository,
			MarketDataFeatureRepository marketDataFeatureRepository,
			BooleanProbabilityMassRepository barBeforeProbabilityMassRepository,
			ProbabilityMassContainerRepository probabilityMassContainerRepository) {
		super(marketDataRepository, marketDataFeatureRepository, barBeforeProbabilityMassRepository,
				probabilityMassContainerRepository);
		// TODO Auto-generated constructor stub
	}

	@Override
	public FeatureType getFeatureType() {
		return FeatureType.SMA_10_CROSS_UNDER;
	}

}
