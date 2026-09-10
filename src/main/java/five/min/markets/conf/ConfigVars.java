package five.min.markets.conf;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import five.min.markets.entity.DataAggregationPeriod;
import lombok.Data;

@Component
@ConfigurationProperties(prefix = "config")
@Data
public class ConfigVars {

	private DataAggregationPeriod dataAggregationPeriod;
	
}
