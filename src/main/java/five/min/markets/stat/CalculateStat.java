package five.min.markets.stat;

import five.min.markets.entity.Market;
import five.min.markets.entity.StatType;

public interface CalculateStat {

	void calculateStat(Market market);
	
	StatType getStatType();
	
}
