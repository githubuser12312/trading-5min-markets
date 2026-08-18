package five.min.markets.pmf;

import org.springframework.stereotype.Component;

import five.min.markets.entity.BarBeforeProbabilityMass;
import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.repo.BarBeforeProbabilityMassRepository;
import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.ProbabilityMassDataRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class AbstractLastBarCurrentBarProbabilityCalculator implements ProbabilityCalculator {

	private MarketDataRepository marketDataRepository;
	private MarketDataFeatureRepository marketDataFeatureRepository;
	private BarBeforeProbabilityMassRepository barBeforeProbabilityMassRepository; 
	private ProbabilityMassContainerRepository probabilityMassContainerRepository;
	
	public AbstractLastBarCurrentBarProbabilityCalculator(MarketDataRepository marketDataRepository,
			MarketDataFeatureRepository marketDataFeatureRepository,
			BarBeforeProbabilityMassRepository barBeforeProbabilityMassRepository,
			ProbabilityMassContainerRepository probabilityMassContainerRepository) {
		this.marketDataRepository = marketDataRepository;
		this.marketDataFeatureRepository = marketDataFeatureRepository;
		this.barBeforeProbabilityMassRepository = barBeforeProbabilityMassRepository;
		this.probabilityMassContainerRepository = probabilityMassContainerRepository;
	}
	
	abstract FeatureType getFeatureType();
	
	@Override
	public void caculateProbaility(Market market) {
		calculateProbaility(market, true, true);
		calculateProbaility(market, true, false);
		calculateProbaility(market, false, true);
		calculateProbaility(market, false, false);
	}
	
	private void calculateProbaility(Market market, boolean currentBarUp, boolean lastBarUp) {
		Long numerator = marketDataRepository.countByUpAndFeatureAndFeatureBooleanValue(
				market, getFeatureType(), currentBarUp, lastBarUp);
		Long denominator = marketDataFeatureRepository.countByMarketAndFeatureTypeAndBooleanValue(
				market, getFeatureType(), lastBarUp);
		log.info("numerator {}, denominator {} currentBar {}, lastBar {}", numerator, denominator, currentBarUp, lastBarUp);
		ProbabilityMassContainer container = getContainer(market);
		BarBeforeProbabilityMass barBeforeProbabilityMass = getBarBeforeProbabilityMass(container, currentBarUp, lastBarUp);
		barBeforeProbabilityMass.setDenominator(denominator);
		barBeforeProbabilityMass.setNumerator(numerator);
		barBeforeProbabilityMassRepository.save(barBeforeProbabilityMass);
		
	}

	private ProbabilityMassContainer getContainer(Market market) {
		ProbabilityMassContainer probabilityMassContainer = probabilityMassContainerRepository.findByMarketEqualsAndFeatureTypeEquals(
				market, getFeatureType());
		if(probabilityMassContainer == null) {
			probabilityMassContainer = new ProbabilityMassContainer();
			probabilityMassContainer.setFeatureType(getFeatureType());
			probabilityMassContainer.setMarket(market);
			return probabilityMassContainerRepository.save(probabilityMassContainer);
		}
		return probabilityMassContainer;
	}
	
	private BarBeforeProbabilityMass getBarBeforeProbabilityMass(ProbabilityMassContainer probabilityMassContainer,
			Boolean currentBarUp, Boolean lastBarUp) {
		BarBeforeProbabilityMass barBeforeProbabilityMass = barBeforeProbabilityMassRepository.findByProbabilityMassContainerEqualsAndLastBarUpEqualsAndCurrentBarUpEquals(
				probabilityMassContainer, lastBarUp, currentBarUp);
		if(barBeforeProbabilityMass == null) {
			barBeforeProbabilityMass = new BarBeforeProbabilityMass();
			barBeforeProbabilityMass.setCurrentBarUp(currentBarUp);
			barBeforeProbabilityMass.setLastBarUp(lastBarUp);
			barBeforeProbabilityMass.setProbabilityMassContainer(probabilityMassContainer);
		}
		return barBeforeProbabilityMass;
	}
}
