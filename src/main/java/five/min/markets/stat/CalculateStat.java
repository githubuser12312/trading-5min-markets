package five.min.markets.stat;

import java.time.LocalDateTime;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.StatType;

public interface CalculateStat {

	void calculateStat(MarketData marketData);
	
	StatType getStatType();
	
}
