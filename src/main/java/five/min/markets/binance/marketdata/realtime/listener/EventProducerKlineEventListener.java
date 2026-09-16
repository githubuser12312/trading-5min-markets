package five.min.markets.binance.marketdata.realtime.listener;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

import com.binance.connector.client.spot.websocket.stream.model.KlineResponse;

import five.min.markets.binance.marketdata.realtime.KlineEventListener;
import five.min.markets.chronicle.QueueFactory;
import five.min.markets.chronicle.config.Queues;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.pool.ObjectPoolFactory;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.queue.ExcerptAppender;

@Component
@Slf4j
public class EventProducerKlineEventListener implements KlineEventListener {

	private QueueFactory queueFactory;
	private ExcerptAppender excerptAppender;
	public EventProducerKlineEventListener(QueueFactory queueFactory) {
		this.queueFactory = queueFactory;
		this.excerptAppender = queueFactory.createAppender(Queues.MARKET_DATA);
		
	}
	
	@Override
	public void accept(KlineResponse event) {
		log.debug("Enter {}", getClass().getSimpleName());
		if(event.getkLowerCase().getxLowerCase()) {
			this.excerptAppender.writeDocument((w) -> {
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
