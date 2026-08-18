package five.min.markets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.feature.UpdateMarketDataFeatures;
import lombok.extern.slf4j.Slf4j;

@Component
@Profile("featureMapper")
@Slf4j
public class MarketDataFeatureMapperRunner implements CommandLineRunner {

	private final UpdateMarketDataFeatures updateMarketDataFeatures;
	
	public MarketDataFeatureMapperRunner(UpdateMarketDataFeatures updateMarketDataFeatures) {
		this.updateMarketDataFeatures = updateMarketDataFeatures;
	}
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Map features");
		this.updateMarketDataFeatures.mapFeatures();
	}

}
