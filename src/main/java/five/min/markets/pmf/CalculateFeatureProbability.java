package five.min.markets.pmf;

import java.util.List;

import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.repo.MarketRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CalculateFeatureProbability {

	private List<ProbabilityCalculator> calculators;
	private MarketRepository marketRepository;
	
	public CalculateFeatureProbability(List<ProbabilityCalculator> calculators,
			MarketRepository marketRepository) {
		this.calculators = calculators;
		this.marketRepository = marketRepository;
	}
	
	public void caculateProbabilityMasses() {
		List<Market> markets = marketRepository.findAll();
		for(Market market : markets) {
			for(ProbabilityCalculator probabilityCalculator : calculators) {
				log.info("Calculate probability for {} and {}", probabilityCalculator.getClass().getSimpleName(), market.getCode());
				probabilityCalculator.caculateProbaility(market);
			}
		}
	} 
}
