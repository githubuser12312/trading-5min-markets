package five.min.markets.chronicle;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

import org.springframework.stereotype.Component;

import five.min.markets.chronicle.config.QueueConfig;
import five.min.markets.chronicle.config.QueueConfigs;
import five.min.markets.chronicle.config.Queues;
import jakarta.annotation.PreDestroy;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.queue.ChronicleQueue;
import net.openhft.chronicle.queue.ExcerptAppender;
import net.openhft.chronicle.queue.ExcerptTailer;
import net.openhft.chronicle.queue.impl.single.SingleChronicleQueueBuilder;

@Component
@Slf4j
public class QueueFactory {

	private final QueueConfigs queueConfigs;
	private final Map<Queues, ChronicleQueue> queues = new HashMap<>();
	
	public QueueFactory(QueueConfigs queueConfigs) {
		this.queueConfigs = queueConfigs;
		createQueusFromConfig();
	}
	
	private void createQueusFromConfig() {
		if(queueConfigs.getConfigs() == null) return;
		for(Queues queueType : queueConfigs.getConfigs().keySet()) {
			QueueConfig config = queueConfigs.getConfigs().get(queueType);
			queues.put(queueType, SingleChronicleQueueBuilder.single(config.getQueuePath()).rollCycle(config.getRollCycle()).build());
		}
	}
	
	public ExcerptAppender createAppender(Queues queue) {
		return getQueue(queue).createAppender();
	}
	
	public ExcerptTailer createReader(Queues queue, String name) {
		return getQueue(queue).createTailer(name);
	}
	
	public void write(Queues queue, Consumer<ExcerptAppender> writer) {
		try(ExcerptAppender appender = getQueue(queue).createAppender()) {
			writer.accept(appender);
		}
	}
	
	public <T> T read(Queues queue, String trailerName, Function<ExcerptTailer, T> action) {
		try(ExcerptTailer trailer = getQueue(queue).createTailer(trailerName)) {
			return action.apply(trailer);
		}
	}
	
	private ChronicleQueue getQueue(Queues queue) {
		if(!queues.containsKey(queue)) {
			throw new RuntimeException(queue.name() + " not found");
		}
		return queues.get(queue);
	}
	
	@PreDestroy
	public void closeQueues() {
		queues.entrySet().forEach(e -> {
			try {
				e.getValue().close();
			} catch (Exception ex) {
				log.error("", e);
			}
		});
	}
	
}
