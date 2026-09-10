package five.min.markets.binance.marketdata.realtime;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

import five.min.markets.entity.Market;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.repo.MarketRepository;
import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Profile("marketListening")
public class BinanceWebSocketContainer {

	private List<BinanceWebsocket> sockets = new ArrayList<>();
	private KlineEventListener defaultListener = new LoggingKlineListener();
	public BinanceWebSocketContainer(
			MarketRepository marketRepository, 
			List<KlineEventListener> eventListeners) {
		List<Market> binanceMarkets = marketRepository.findMarketBySourceEquals(Source.BINANCE);
		for(Market m : binanceMarkets) {
			BinanceWebsocket mSocket = new BinanceWebsocket(m);
			List<KlineEventListener> listeners = eventListeners
					.stream()
					.filter(l -> m.getCode().equals(l.getMarketCode()))
					.filter(l -> m.getPeriod() == l.getPeriod())
					.toList();
			listeners.forEach(l -> mSocket.addListener(l));
			mSocket.addListener(defaultListener);
			sockets.add(mSocket);
		}
	}
	
	@PostConstruct
	public void startListening() {
		sockets.forEach(s -> s.stream());
	}
	
	
	private class LoggingKlineListener implements KlineEventListener {

		@Override
		public void accept(KlineResponse event) {
			System.out.println(event);
		}

		@Override
		public String getMarketCode() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Period getPeriod() {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Source getSource() {
			// TODO Auto-generated method stub
			return null;
		}
		
	}
}
