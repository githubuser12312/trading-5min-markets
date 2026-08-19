package five.min.markets.stat;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketStat;
import five.min.markets.entity.StatType;

public abstract class AbstractCalculateStat implements CalculateStat {

	private StatType statType;
	
	public AbstractCalculateStat(StatType statType) {
		this.statType = statType;
	}

	@Override
	public StatType getStatType() {
		return statType;
	}
	
	
}
