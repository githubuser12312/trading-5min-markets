package five.min.markets.chronicle.api;

import five.min.markets.events.model.RuntimeMarketData;

public interface MarketDataApi {

	void onCandleClose(RuntimeMarketData marketData);
	
}
