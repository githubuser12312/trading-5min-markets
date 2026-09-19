package five.min.markets.poly.scheduled;

import java.io.IOException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import five.min.markets.entity.Period;
import five.min.markets.poly.api.rest.PolyRest;
import five.min.markets.poly.config.PolyConfig;
import five.min.markets.poly.config.PolyEventConfig;
import five.min.markets.poly.entity.PolyBinaryPredictionMarket;
import five.min.markets.poly.model.market.Event;
import five.min.markets.poly.model.market.Market;
import five.min.markets.poly.repo.PolyBinaryPredictionMarketRepository;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
@Slf4j
public class FetchNewPolyMarkets {

	private final PolyRest polyRest;
	private final PolyBinaryPredictionMarketRepository polyBinaryPredictionMarketRepository;
	private final PolyConfig polyConfig;
	private final ObjectMapper objectMapper = new ObjectMapper();
	
	public FetchNewPolyMarkets(PolyRest polyRest, 
			PolyBinaryPredictionMarketRepository polyBinaryPredictionMarketRepository,
			PolyConfig polyConfig) {
		this.polyRest = polyRest;
		this.polyBinaryPredictionMarketRepository = polyBinaryPredictionMarketRepository;
		this.polyConfig = polyConfig;
	}
	
	@Scheduled(cron = "@hourly")
	@SchedulerLock(lockAtLeastFor = "PT30S", lockAtMostFor = "PT30M")
	public void updateMarkets() {
		Instant now = Instant.now();
		for(PolyEventConfig eventConfig : polyConfig.getEventConfigs()) {
			try {
				List<Event> events = polyRest.getBySeriesSlug(eventConfig.getSlug(), now, 12, 0);
				saveUpdateEvents(events, eventConfig);
			} catch (Exception e) {
				log.error("", e);
			} 
			
		}
	}
	
	private void saveUpdateEvents(List<Event> events, PolyEventConfig eventConfig) {
		events.stream().forEach(e -> {
			PolyBinaryPredictionMarket polyBinaryPredictionMarket = mapEvent(e, eventConfig);
			polyBinaryPredictionMarketRepository.save(polyBinaryPredictionMarket);
		});
	}
	
	private PolyBinaryPredictionMarket mapEvent(Event event, PolyEventConfig eventConfig) {
		try {
			Market market = event.getMarkets().get(0);
			PolyBinaryPredictionMarket current = polyBinaryPredictionMarketRepository.findBinaryPredictionMarketBySlug(market.getSlug());
			if(current == null) {
				current = new PolyBinaryPredictionMarket();
			}
			current.setAcceptingOrders(market.getAcceptingOrders());
			current.setActive(market.getActive());
			current.setCode(eventConfig.getCode());
			current.setEnd(market.getEndDate().toInstant());
			current.setMarketJson(objectMapper.writeValueAsString(event));
			current.setMinOrderSize(market.getOrderMinSize());
			current.setOrderPriceMinTickSize(market.getOrderPriceMinTickSize());
			current.setPeriod(eventConfig.getPeriod());
			current.setPolyId(Long.parseLong(market.getId()));
			current.setSeriesSlug(eventConfig.getSlug());
			current.setSlug(market.getSlug());
			current.setStart(market.getStartDate().toInstant());
			current.setStartEpochSeconds(getCandleStart(current.getEnd(), eventConfig.getPeriod()).getEpochSecond());
			current.setStartEpochSecondsMillis(getCandleStart(current.getEnd(), eventConfig.getPeriod()).toEpochMilli());
			current.setTicker(event.getTicker());
			current.setTitle(event.getTitle());
			String[] clobTokendIds = getClobTokenIds(market);
			current.setUpClobTokenId(clobTokendIds[0]);
			current.setDownClobTokenId(clobTokendIds[1]);
			return current;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private Instant getCandleStart(Instant end, Period period) {
		return switch(period) {
		case FIVE_MINUTES -> end.minus(5, ChronoUnit.MINUTES);
		case ONE_SECOND -> end.minus(1, ChronoUnit.SECONDS);
		};
	}
	
	private String[] getClobTokenIds(Market market) throws JsonMappingException, JsonProcessingException {
		List<String> directions = objectMapper.readValue(market.getOutcomes(), new TypeReference<List<String>>() {});
		directions = directions.stream().map(v -> v.toLowerCase()).toList();
		List<String> clobTokendIds = objectMapper.readValue(market.getOutcomes(), new TypeReference<List<String>>() {});
		int upIndex = directions.indexOf("up");
		int downIndex = directions.indexOf("down");
		return new String[] {clobTokendIds.get(upIndex), clobTokendIds.get(downIndex)};
	}
}
