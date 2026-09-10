package five.min.markets.pmf;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Set;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.entity.StringProbabilityMass;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.StringProbabilityMassRepository;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StringProbabilityCalculator extends AbstractProbabilityCalculator {

	private MarketDataFeatureRepository marketDataFeatureRepository;
	private StringProbabilityMassRepository stringProbabilityMassRepository;
	@Getter
	private FeatureType featureType;
	
	public StringProbabilityCalculator(FeatureType featureValue,
			ProbabilityMassContainerRepository probabilityMassContainerRepository,
			StringProbabilityMassRepository stringProbabilityMassRepository,
			MarketDataFeatureRepository marketDataFeatureRepository) {
		super(probabilityMassContainerRepository);
		this.stringProbabilityMassRepository = stringProbabilityMassRepository;
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.featureType = featureValue;
	}

	@Override
	public void caculateProbaility(MarketData market) {
		Set<String> featureValues = getFeatureValues(market);
		log.info("{} located feature values {}", getFeatureType(), featureValues);
		Instant minDateInclusive = market.getMarket().getLookBackDateInclusive(market);
		for(String featureValue : featureValues) {
			calculateProbaility(market, true, featureValue, minDateInclusive);
			calculateProbaility(market, false, featureValue, minDateInclusive);
		}
	}
	
	private void calculateProbaility(MarketData market, boolean predictionBar, String featureValue, Instant minDateInclusive) {

		Long numerator = marketDataFeatureRepository.featurePredictionNumerator(
				market, getFeatureType(), predictionBar, featureValue, minDateInclusive);
		Long denominator = marketDataFeatureRepository.featurePredictionDenominator(
				market, getFeatureType(), featureValue, minDateInclusive);
		log.debug("numerator {}, denominator {} currentBar {}, featureValue {}, minDate {}, maxDate {}", 
				numerator, denominator, predictionBar, featureValue, minDateInclusive, market.getStart());
		ProbabilityMassContainer container = getContainer(market);
		StringProbabilityMass stringProbabilityMass = getBarBeforeProbabilityMass(container, predictionBar, featureValue);
		stringProbabilityMass.setDenominator(denominator);
		stringProbabilityMass.setNumerator(numerator);
		stringProbabilityMassRepository.save(stringProbabilityMass);
		
	}

	private StringProbabilityMass getBarBeforeProbabilityMass(ProbabilityMassContainer probabilityMassContainer,
			Boolean predictionBar, String featureValue) {
		StringProbabilityMass barBeforeProbabilityMass = stringProbabilityMassRepository.findByProbabilityMassContainerEqualsAndLastBarBooleanEqualsAndFeatureValueEquals(
				probabilityMassContainer, predictionBar, featureValue);
		if(barBeforeProbabilityMass == null) {
			barBeforeProbabilityMass = new StringProbabilityMass();
			barBeforeProbabilityMass.setFeatureValue(featureValue);
			barBeforeProbabilityMass.setLastBarBoolean(predictionBar);
			barBeforeProbabilityMass.setProbabilityMassContainer(probabilityMassContainer);
		}
		return barBeforeProbabilityMass;
	}

	protected Set<String> getFeatureValues(MarketData market) {
		return marketDataFeatureRepository.findFeatureValues(market, getFeatureType());
	}
}
