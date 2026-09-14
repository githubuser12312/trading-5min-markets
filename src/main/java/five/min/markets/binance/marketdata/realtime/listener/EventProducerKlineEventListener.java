package five.min.markets.binance.marketdata.realtime.listener;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

import five.min.markets.binance.marketdata.realtime.KlineEventListener;
import five.min.markets.chronicle.config.QueueFactory;
import five.min.markets.chronicle.config.Queues;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.pool.ObjectPoolFactory;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class EventProducerKlineEventListener implements KlineEventListener {

	private QueueFactory queueFactory;
	public EventProducerKlineEventListener(QueueFactory queueFactory) {
		this.queueFactory = queueFactory;
	}
	
	@Override
	public void accept(KlineResponse event) {
		log.info("Enter {}", getClass().getSimpleName());
		queueFactory.write(Queues.MARKET_DATA, appender -> {
			appender.writeDocument((w) -> {
				w.write("m").writeString(getMarketCode())
					.write("p").writeInt(getPeriod().ordinal())
					.write("s").writeInt(getSource().ordinal())
					.write("o").writeDouble(Double.valueOf(event.getkLowerCase().getoLowerCase()))
					.write("h").writeDouble(Double.valueOf(event.getkLowerCase().gethLowerCase()))
					.write("l").writeDouble(Double.valueOf(event.getkLowerCase().getlLowerCase()))
					.write("c").writeDouble(Double.valueOf(event.getkLowerCase().getcLowerCase()))
					.write("v").writeDouble(Double.valueOf(event.getkLowerCase().getvLowerCase()))
					.write("t").writeLong(event.getE())
					.write("cs").writeLong(event.getkLowerCase().gettLowerCase())
					.write("cc").writeLong(event.getkLowerCase().getT());
			});
		});
		log.info("Exit {}", getClass().getSimpleName());
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
