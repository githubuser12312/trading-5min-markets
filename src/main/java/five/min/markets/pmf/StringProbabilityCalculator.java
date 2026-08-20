package five.min.markets.pmf;

import java.util.Set;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
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
	public void caculateProbaility(Market market) {
		Set<String> featureValues = getFeatureValues(market);
		log.info("{} located feature values {}", getFeatureType(), featureValues);
		for(String featureValue : featureValues) {
			calculateProbaility(market, true, featureValue);
			calculateProbaility(market, false, featureValue);
		}
	}
	
	private void calculateProbaility(Market market, boolean predictionBar, String featureValue) {
		Long numerator = marketDataFeatureRepository.featurePredictionNumerator(
				market, getFeatureType(), predictionBar, featureValue);
		Long denominator = marketDataFeatureRepository.featurePredictionDenominator(
				market, getFeatureType(), featureValue);
		log.info("numerator {}, denominator {} currentBar {}, featureValue {}", numerator, denominator, predictionBar, featureValue);
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

	protected Set<String> getFeatureValues(Market market) {
		return marketDataFeatureRepository.findFeatureValues(market, getFeatureType());
	}
}
