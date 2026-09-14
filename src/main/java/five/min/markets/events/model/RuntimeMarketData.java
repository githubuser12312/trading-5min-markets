package five.min.markets.events.model;

import five.min.markets.entity.MarketData;
import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class RuntimeMarketData extends MarketData {

	private long eventTime;
	private long candleStart;
	private long candleClose;
}
