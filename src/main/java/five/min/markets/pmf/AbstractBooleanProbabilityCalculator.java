package five.min.markets.pmf;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

import org.springframework.stereotype.Component;

import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.repo.BooleanProbabilityMassRepository;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.ProbabilityMassDataRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractBooleanProbabilityCalculator extends AbstractProbabilityCalculator
		implements ProbabilityCalculator {

	private MarketDataRepository marketDataRepository;
	private MarketDataFeatureRepository marketDataFeatureRepository;
	private BooleanProbabilityMassRepository barBeforeProbabilityMassRepository;

	public AbstractBooleanProbabilityCalculator(MarketDataRepository marketDataRepository,
			MarketDataFeatureRepository marketDataFeatureRepository,
			BooleanProbabilityMassRepository barBeforeProbabilityMassRepository,
			ProbabilityMassContainerRepository probabilityMassContainerRepository) {
		super(probabilityMassContainerRepository);
		this.marketDataRepository = marketDataRepository;
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.barBeforeProbabilityMassRepository = barBeforeProbabilityMassRepository;
		this.probabilityMassContainerRepository = probabilityMassContainerRepository;
	}

	@Override
	public void caculateProbaility(MarketData market) {
		Instant minDateInclusive = market.getMarket().getLookBackDateInclusive(market);
		calculateProbaility(market, true, true, minDateInclusive);
		calculateProbaility(market, true, false, minDateInclusive);
		calculateProbaility(market, false, true, minDateInclusive);
		calculateProbaility(market, false, false, minDateInclusive);
	}

	private void calculateProbaility(MarketData market, boolean featureValue, boolean predictionBar, Instant minDateInclusive) {

		Long numerator = marketDataFeatureRepository.featurePredictionNumerator(market, getFeatureType(),
				predictionBar, featureValue, minDateInclusive);
		Long denominator = marketDataFeatureRepository.featurePredictionDenominator(market,
				getFeatureType(), featureValue, minDateInclusive);
		log.info("numerator {}, denominator {} feature value {}, prediction bar {}, feature type {}", numerator, denominator,
				featureValue, predictionBar, getFeatureType());
		ProbabilityMassContainer container = getContainer(market);
		BooleanProbabilityMass barBeforeProbabilityMass = getBarBeforeProbabilityMass(container, featureValue,
				predictionBar);
		barBeforeProbabilityMass.setDenominator(denominator);
		barBeforeProbabilityMass.setNumerator(numerator);
		barBeforeProbabilityMassRepository.save(barBeforeProbabilityMass);

	}

	private BooleanProbabilityMass getBarBeforeProbabilityMass(ProbabilityMassContainer probabilityMassContainer,
			Boolean featurBoolean, Boolean lastBarBoolean) {
		BooleanProbabilityMass barBeforeProbabilityMass = barBeforeProbabilityMassRepository
				.findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(
						probabilityMassContainer, lastBarBoolean, featurBoolean);
		if (barBeforeProbabilityMass == null) {
			barBeforeProbabilityMass = new BooleanProbabilityMass();
			barBeforeProbabilityMass.setFeatureValue(featurBoolean);
			barBeforeProbabilityMass.setLastBarBoolean(lastBarBoolean);
			barBeforeProbabilityMass.setProbabilityMassContainer(probabilityMassContainer);
		}
		return barBeforeProbabilityMass;
	}
}
