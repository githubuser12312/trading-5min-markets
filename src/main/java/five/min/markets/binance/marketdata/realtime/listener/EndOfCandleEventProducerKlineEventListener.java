package five.min.markets.binance.marketdata.realtime.listener;

import java.math.BigDecimal;
import java.time.Instant;

import org.springframework.stereotype.Component;

import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

import five.min.markets.binance.marketdata.realtime.KlineEventListener;
import five.min.markets.chronicle.QueueFactory;
import five.min.markets.chronicle.api.MarketDataApi;
import five.min.markets.chronicle.config.Queues;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.pool.ObjectPoolFactory;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.wire.MethodWriter;

@Component
@Slf4j
public class EndOfCandleEventProducerKlineEventListener implements KlineEventListener {

	private QueueFactory queueFactory;
	private ExcerptAppender excerptAppender;
	private MarketDataApi marketDataApi;
	private ObjectPoolFactory objectPoolFactory;
	public EndOfCandleEventProducerKlineEventListener(QueueFactory queueFactory,
			ObjectPoolFactory objectPoolFactory) {
		this.queueFactory = queueFactory;
		this.objectPoolFactory = objectPoolFactory;
		this.excerptAppender = queueFactory.createAppender(Queues.MARKET_DATA);
		this.marketDataApi = excerptAppender.methodWriter(MarketDataApi.class);
		
	}
	
	@Override
	public void accept(KlineResponse event) {
		log.debug("Enter {}", getClass().getSimpleName());
		if(event.getkLowerCase().getxLowerCase()) {
			RuntimeMarketData marketData = objectPoolFactory.borrow(RuntimeMarketData.class);
			try {
				marketData.setCode(getMarketCode());
				marketData.setPeriod(getPeriod());
				marketData.setSource(getSource());
				marketData.setClose(Double.valueOf(event.getkLowerCase().getcLowerCase()));
				marketData.setOpen(Double.valueOf(event.getkLowerCase().getoLowerCase()));
				marketData.setHigh(Double.valueOf(event.getkLowerCase().gethLowerCase()));
				marketData.setLow(Double.valueOf(event.getkLowerCase().getlLowerCase()));
				marketData.setVolume(Double.valueOf(event.getkLowerCase().getvLowerCase()));
				marketData.setEventTime(event.getE());
				marketData.setCandleClose(event.getkLowerCase().getT());
				marketData.setCandleStart(event.getkLowerCase().gettLowerCase());
				marketData.setUp(marketData.getClose() > marketData.getOpen());
				marketData.setStart(Instant.ofEpochMilli(marketData.getCandleStart()));
				marketDataApi.onCandleClose(marketData);
			} finally {
				if(marketData != null) {
					objectPoolFactory.give(marketData);
				}
			}
		}
		log.debug("Exit {}", getClass().getSimpleName());
	}
	
	@Override
	public String getMarketCode() {
		return "BTCUSDT";
	}

	@Override
	public Period getPeriod() {
		return Period.FIVE_MINUTES;
	}

	@Override
	public Source getSource() {
		return Source.BINANCE;
	}

}
