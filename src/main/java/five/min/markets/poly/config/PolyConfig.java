package five.min.markets.poly.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "poly.config")
@Data
public class PolyConfig {

	private List<PolyEventConfig> eventConfigs;
}
