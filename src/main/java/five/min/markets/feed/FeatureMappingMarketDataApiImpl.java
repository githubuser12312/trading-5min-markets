package five.min.markets.feed;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.analysis.FeatureGenerator;
import five.min.markets.chronicle.api.MarketDataApi;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.feature.FeatureMapper;

@Profile("marketListening")
@Component
public class FeatureMappingMarketDataApiImpl implements MarketDataApi {

	private FeatureGenerator featureGenerator; 
	
	public FeatureMappingMarketDataApiImpl(FeatureGenerator featureGenerator) {
		this.featureGenerator = featureGenerator;
	}
	
	@Override
	public void onCandleClose(RuntimeMarketData marketData) {
		MarketDataFeature[] feature = featureGenerator.getFeatures((IMarketData) marketData);
		Stream.of(feature).forEach(f -> System.out.println(f));
		featureGenerator.returnToPool(feature);
		System.out.println("Mapped features");
	}

}
