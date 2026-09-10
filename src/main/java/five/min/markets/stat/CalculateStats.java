package five.min.markets.stat;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class CalculateStats {

	private List<CalculateStat> stats;
	
	public CalculateStats(List<CalculateStat> stats) {
		this.stats = stats;
	}
	
	public void caculateStats(MarketData marketData, Integer order) {
		if(!marketData.getMarket().isAggregationNow(marketData)) {
			log.debug("No aggregation required");
			return;
		}
		log.info("Aggregating data at {}", marketData.getStart().toString());
		for(CalculateStat calculator : stats) {
			if(calculator.getStatType().order == order) {
				log.debug("Calculate probability for {} and {}", 
						calculator.getClass().getSimpleName(), marketData.getMarket().getCode());
				calculator.calculateStat(marketData);
			}
		}
	} 

}
