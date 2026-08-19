package five.min.markets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.stat.CalculateStats;

@Component
@Profile("calculateStats")
public class CalculateStatsRunner  implements CommandLineRunner{

	private CalculateStats calculateStats;
	
	public CalculateStatsRunner(CalculateStats calculateStats) {
		this.calculateStats = calculateStats;
	}

	@Override
	public void run(String... args) throws Exception {
		this.calculateStats.caculateStats(0);
	}
	
	

}
