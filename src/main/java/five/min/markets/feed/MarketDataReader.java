package five.min.markets.feed;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.chronicle.QueueFactory;
import five.min.markets.chronicle.config.Queues;
import five.min.markets.entity.Market;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.pool.ObjectPoolFactory;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.core.io.InvalidMarshallableException;
import net.openhft.chronicle.core.threads.InvalidEventHandlerException;

@Component
@Slf4j
public class MarketDataReader implements MarketDataEventHandler {

	private QueueFactory queueFactory;
	private ObjectPoolFactory objectPoolFactory;
	private String trailerName = "MarketDataReader-Trailer";
	
	public MarketDataReader(QueueFactory queueFactory,
			ObjectPoolFactory objectPoolFactory) {
		this.queueFactory = queueFactory;
		this.objectPoolFactory = objectPoolFactory;
	}

	@Override
	public boolean action() throws InvalidEventHandlerException, InvalidMarshallableException {
		return queueFactory.read(Queues.MARKET_DATA, trailerName, trailer -> {
			RuntimeMarketData marketData = objectPoolFactory.borrow(RuntimeMarketData.class);
			Market market = objectPoolFactory.borrow(Market.class);
			try {
				if(marketData == null || market == null) return false;
				boolean documeRead = trailer.readDocument(m -> {
					marketData.setClose(m.read("c").readDouble());
					marketData.setOpen(m.read("o").readDouble());
					marketData.setHigh(m.read("h").readDouble());
					marketData.setLow(m.read("l").readDouble());
					marketData.setCandleClose(m.read("cc").readLong());
					marketData.setEventTime(m.read("t").readLong());
					marketData.setCandleStart(m.read("cs").readLong());
					market.setCode(m.read("m").readString());
					market.setPeriod(Period.values()[m.read("p").readInt()]);
					market.setSource(Source.values()[m.read("s").readInt()]);
					marketData.setMarket(market);
					log.debug("{}", marketData);
				});
				return documeRead;
			} catch (Exception e) {
				log.error("Error reading market data document {}", e.getMessage());
				return false;
			}
			finally {
				if(marketData != null) {
					objectPoolFactory.give(marketData);
				}
				if(market != null) {
					objectPoolFactory.give(market);
				}
			}
		});

	}
	
	
}
