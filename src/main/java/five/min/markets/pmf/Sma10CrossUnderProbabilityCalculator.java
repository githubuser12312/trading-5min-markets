package five.min.markets.pmf;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.repo.BarBeforeProbabilityMassRepository;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;

@Component
public class Sma10CrossUnderProbabilityCalculator extends AbstractLastBarCurrentBarProbabilityCalculator {

	public Sma10CrossUnderProbabilityCalculator(MarketDataRepository marketDataRepository,
			MarketDataFeatureRepository marketDataFeatureRepository,
			BarBeforeProbabilityMassRepository barBeforeProbabilityMassRepository,
			ProbabilityMassContainerRepository probabilityMassContainerRepository) {
		super(marketDataRepository, marketDataFeatureRepository, barBeforeProbabilityMassRepository,
				probabilityMassContainerRepository);
		// TODO Auto-generated constructor stub
	}

	@Override
	FeatureType getFeatureType() {
		return FeatureType.SMA_10_CROSS_UNDER;
	}

}
