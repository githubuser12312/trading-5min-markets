package five.min.markets.binance.marketdata.realtime;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Async;

import com.binance.connector.client.common.websocket.configuration.WebSocketClientConfiguration;
import com.binance.connector.client.common.websocket.service.StreamBlockingQueueWrapper;
import com.binance.connector.client.spot.websocket.stream.SpotWebSocketStreamsUtil;
import com.binance.connector.client.spot.websocket.stream.api.SpotWebSocketStreams;
import com.binance.connector.client.spot.websocket.stream.model.KlineRequest;
import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

import five.min.markets.entity.Market;
import five.min.markets.entity.Source;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BinanceWebsocket implements Runnable {

	private SpotWebSocketStreams api;
	private StreamBlockingQueueWrapper<KlineResponse> messageQueue;
	private Market market;
	private KlineRequest klineRequest;
	private List<KlineEventListener> listeners = new ArrayList<>();
	
	public BinanceWebsocket(Market market) {
		if(market.getSource() != Source.BINANCE) {
			throw new RuntimeException("Market source " + market.getSource() + " is not binance");
		}
		this.market = market;
		KlineRequest klineRequest = new KlineRequest();
		klineRequest.setId(UUID.randomUUID().toString());
		klineRequest.setInterval(market.getPeriod().binanceValue);
		klineRequest.setSymbol(market.getCode().toLowerCase());
		this.klineRequest = klineRequest;
	}
	
	public void run() {
		do {
			try {
				log.info("Connect to spot market stream for {}", market);
				listen();
			} catch (Throwable e) {
				log.error("Error listening to spot market {}", market, e);
			}
		} while(true);
	}
	
	private void listen() throws Exception {
		initApi();
		messageQueue = api.kline(klineRequest);
		log.info("Being listening on market {} with {}", market, klineRequest);
		while(true) {
			KlineResponse response = messageQueue.take();
			listeners.forEach(l -> l.accept(response));
			TimeUnit.MILLISECONDS.sleep(1);
		}
	}
	

    public void initApi() {
        WebSocketClientConfiguration clientConfiguration =
                    SpotWebSocketStreamsUtil.getClientConfiguration();
            api = new SpotWebSocketStreams(clientConfiguration);
    }
	
	public synchronized void addListener(KlineEventListener listener) {
		this.listeners.add(listener);
	}
}
