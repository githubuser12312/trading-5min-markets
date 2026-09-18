package five.min.markets;

import java.lang.reflect.InvocationTargetException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.pool.ObjectPool;
import five.min.markets.probability.BernoulliBayesModel;

@Configuration
public class PoolConfiguration {

	@Bean
	ObjectPool<RuntimeMarketData> marketDataObjectPool() throws Exception {
		return new ObjectPool<>(RuntimeMarketData.class, 1);
	}
	
	@Bean
	ObjectPool<MarketDataFeature> marketDataFeatuerObjectPool() throws Exception {
		return new ObjectPool<>(MarketDataFeature.class, FeatureType.values().length);
	}

}
