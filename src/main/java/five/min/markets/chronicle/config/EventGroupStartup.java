package five.min.markets.chronicle.config;

import java.util.List;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import five.min.markets.events.model.MarketDataEventHandler;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.threads.EventGroup;

@Component
@Slf4j
public class EventGroupStartup implements ApplicationListener<ApplicationReadyEvent> {
	
	private List<MarketDataEventHandler> marketDataEventHandlers;
	private boolean initialised = false;
	public EventGroupStartup(List<MarketDataEventHandler> marketDataEventHandlers) {
		this.marketDataEventHandlers = marketDataEventHandlers;
	}
	
	private void startMarketDataGroup() {
		if(marketDataEventHandlers.size() == 0) return;
		log.info("Creating event group with {} handlers", marketDataEventHandlers.size());
		EventGroup eventGroup = EventGroup.builder()
				.withName("md-handlers")
				.build();
		marketDataEventHandlers.forEach(h -> eventGroup.addHandler(h));
		log.info("Start event group with {} handlers", marketDataEventHandlers.size());
		eventGroup.start();
		log.info("Return event group with {} handlers", marketDataEventHandlers.size());
	}

	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		if(initialised) return;
		startMarketDataGroup();
		
		initialised = true;
	}
}
