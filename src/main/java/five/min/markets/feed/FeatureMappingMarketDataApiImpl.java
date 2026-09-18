package five.min.markets.feed;

import five.min.markets.repo.ProbabilityMassContainerRepository;
import lombok.extern.slf4j.Slf4j;

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
import five.min.markets.probability.ProbabilityCalculator;

@Profile("marketListening")
@Component
@Slf4j
public class FeatureMappingMarketDataApiImpl implements MarketDataApi {

	private FeatureGenerator featureGenerator; 
	private ProbabilityCalculator probabilityCalculator;
	
	public FeatureMappingMarketDataApiImpl(FeatureGenerator featureGenerator, 
			ProbabilityCalculator probabilityCalculator) {
		this.featureGenerator = featureGenerator;
		this.probabilityCalculator = probabilityCalculator;
	}
	
	@Override
	public void onCandleClose(RuntimeMarketData marketData) {
		MarketDataFeature[] feature = featureGenerator.getFeatures((IMarketData) marketData);
		Stream.of(feature).forEach(f -> System.out.println(f));
		double probability = probabilityCalculator.calculateProbability(marketData, feature);
		log.info("Probability of market up is {}", probability);		
		featureGenerator.returnToPool(feature);
	}

}
