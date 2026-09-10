package five.min.markets.pmf;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.repo.ProbabilityMassContainerRepository;

public abstract class AbstractProbabilityCalculator implements ProbabilityCalculator{

	protected ProbabilityMassContainerRepository probabilityMassContainerRepository;
	
	public AbstractProbabilityCalculator(ProbabilityMassContainerRepository probabilityMassContainerRepository) {
		super();
		this.probabilityMassContainerRepository = probabilityMassContainerRepository;
	}

	protected ProbabilityMassContainer getContainer(MarketData market) {
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

}