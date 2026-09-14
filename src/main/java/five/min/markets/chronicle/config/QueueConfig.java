package five.min.markets.chronicle.config;

import lombok.Data;
import net.openhft.chronicle.queue.RollCycles;

@Data
public class QueueConfig {

	private String queuePath;
	private RollCycles rollCycle;
}
