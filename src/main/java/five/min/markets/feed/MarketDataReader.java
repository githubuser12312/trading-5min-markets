package five.min.markets.feed;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.analysis.FeatureGenerator;
import five.min.markets.chronicle.QueueFactory;
import five.min.markets.chronicle.api.MarketDataApi;
import five.min.markets.chronicle.config.Queues;
import five.min.markets.entity.Market;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.pool.ObjectPoolFactory;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.bytes.MethodReader;
import net.openhft.chronicle.core.io.InvalidMarshallableException;
import net.openhft.chronicle.core.threads.InvalidEventHandlerException;
import net.openhft.chronicle.queue.ExcerptAppender;
@Profile("marketListening")
@Component
@Slf4j
public class MarketDataReader implements MarketDataEventHandler {

	private MethodReader reader; 
	public MarketDataReader(QueueFactory queueFactory,
			FeatureMappingMarketDataApiImpl candleMarketDataApiImpl) {
		this.reader = queueFactory.createReader(Queues.MARKET_DATA, getClass().getSimpleName()).methodReader(candleMarketDataApiImpl);
	}

	@Override
	public boolean action() throws InvalidEventHandlerException, InvalidMarshallableException {
		return reader.readOne();
	}
	
	
}
