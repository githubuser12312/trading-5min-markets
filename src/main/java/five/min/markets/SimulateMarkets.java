package five.min.markets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.repo.MarketRepository;
import five.min.markets.simulate.MarketSimulationEngine;

@Component
@Profile("simulateMarkets")
public class SimulateMarkets implements CommandLineRunner {

	private MarketSimulationEngine marketSimulationEngine;
	private MarketRepository marketRepository;
	public SimulateMarkets(MarketSimulationEngine marketSimulationEngine,
			MarketRepository marketRepository) {
		this.marketSimulationEngine = marketSimulationEngine;
		this.marketRepository = marketRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		marketRepository.findAll().forEach(m -> marketSimulationEngine.runSimulationOn(m));
	}

}
