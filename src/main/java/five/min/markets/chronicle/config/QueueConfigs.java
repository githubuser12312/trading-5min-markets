package five.min.markets.chronicle.config;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "queue.config")
@Data
public class QueueConfigs {

	private Map<Queues, QueueConfig> configs;
}
