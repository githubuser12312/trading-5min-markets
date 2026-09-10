package five.min.markets.entity;

import com.binance.connector.client.spot.websocket.stream.model.Interval;

public enum Period {
	FIVE_MINUTES(Interval.INTERVAL_5m),
	ONE_SECOND(Interval.INTERVAL_1s);
	
	public final Interval binanceValue;
	
	private Period(Interval binanceValue) {
		this.binanceValue = binanceValue;
	}
}
