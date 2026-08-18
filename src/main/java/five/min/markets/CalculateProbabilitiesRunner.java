package five.min.markets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.pmf.CalculateFeatureProbability;
import lombok.extern.slf4j.Slf4j;

@Component
@Profile("calculateProbability")
@Slf4j
public class CalculateProbabilitiesRunner implements CommandLineRunner {

	@Autowired
	private CalculateFeatureProbability calculateFeatureProbailities;
	
	@Override
	public void run(String... args) throws Exception {
		log.info("Calculate probabilities");
		calculateFeatureProbailities.caculateProbabilityMasses();
	}

}
