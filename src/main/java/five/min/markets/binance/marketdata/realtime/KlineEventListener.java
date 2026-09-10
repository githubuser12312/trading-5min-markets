package five.min.markets.binance.marketdata.realtime;

import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

import five.min.markets.entity.Period;
import five.min.markets.entity.Source;

public interface KlineEventListener {

	void accept(KlineResponse event);
	
	String getMarketCode();
	
	Period getPeriod();
	
	Source getSource();
}
