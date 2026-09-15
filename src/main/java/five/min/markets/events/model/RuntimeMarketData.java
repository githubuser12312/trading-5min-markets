package five.min.markets.events.model;

import five.min.markets.entity.MarketData;
import five.min.markets.pool.Poolable;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class RuntimeMarketData extends MarketData implements Poolable {

	private long eventTime;
	private long candleStart;
	private long candleClose;
	@Override
	public void reset() {
		super.reset();
		this.eventTime = 0;
		this.candleStart = 0;
		this.candleClose = 0;
	}
}
