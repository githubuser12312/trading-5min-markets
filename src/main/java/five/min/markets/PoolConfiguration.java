package five.min.markets;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.pool.ObjectPool;

@Configuration
public class PoolConfiguration {

	@Bean
	ObjectPool<MarketDataFeature> marketDataFeatureObjectPool() throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException {
		return new ObjectPool<>(MarketDataFeature.class, 100);
	}
	
	@Bean
	ObjectPool<RuntimeMarketData> marketDataObjectPool() throws Exception {
		return new ObjectPool<>(RuntimeMarketData.class, 100);
	}
	
	@Bean
	ObjectPool<Market> marketObjectPool() throws Exception {
		return new ObjectPool<>(Market.class, 100);
	}
}
