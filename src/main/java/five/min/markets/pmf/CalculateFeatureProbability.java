package five.min.markets.pmf;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketRepository;
import lombok.extern.slf4j.Slf4j;
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
@Slf4j
public class CalculateFeatureProbability {

	private List<ProbabilityCalculator> calculators;
	
	public CalculateFeatureProbability(List<ProbabilityCalculator> calculators) {
		this.calculators = calculators;
	}
	
	public void caculateProbabilityMasses(MarketData marketData, Integer order) {
		if(!marketData.getMarket().isAggregationNow(marketData)) {
			log.debug("No aggregation required");
			return;
		}
		log.info("Aggregating data at {}", marketData.getStart().toString());
		for(ProbabilityCalculator probabilityCalculator : calculators) {
			if(probabilityCalculator.getFeatureType().order == order) {
				log.debug("Calculate probability for {} and {}", 
						probabilityCalculator.getClass().getSimpleName(), marketData.getMarket().getCode());
				probabilityCalculator.caculateProbaility(marketData);
			}
		}
	} 
}
