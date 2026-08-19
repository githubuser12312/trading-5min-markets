package five.min.markets.stat;

import java.util.List;

import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.repo.MarketRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CalculateStats {

	private MarketRepository marketRepository;
	private List<CalculateStat> stats;
	
	public CalculateStats(List<CalculateStat> stats,
			MarketRepository marketRepository) {
		this.stats = stats;
		this.marketRepository = marketRepository;
	}
	
	public void caculateStats(Integer order) {
		List<Market> markets = marketRepository.findAll();
		for(Market market : markets) {
			List<CalculateStat> statsAtOrder = stats.stream().filter(c -> c.getStatType().order == order).toList();
			for(CalculateStat calculator : statsAtOrder) {
				log.info("Calculate probability for {} and {}", 
						calculator.getClass().getSimpleName(), market.getCode());
				calculator.calculateStat(market);
			}
		}
	} 

}
