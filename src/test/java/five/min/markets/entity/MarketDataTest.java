package five.min.markets.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;

@SpringBootTest
public class MarketDataTest {

	@Autowired
	private MarketRepository marketRepository;
	@Autowired
	private MarketDataRepository marketDataRepository;
	
	private Market createMarket() {
		Market market = new Market();
		market.setCode(UUID.randomUUID().toString().substring(0, 20));
		market.setSource(Source.BINANCE);
		market.setPeriod(Period.FIVE_MINUTES);
		return marketRepository.save(market);
		
	}
	
	private MarketData createMarketData(Market market, int count) {
		LocalDateTime start = LocalDateTime.of(2026, 7, 14, 0, 0);
		start = start.plus(5 * count, ChronoUnit.MINUTES);
		MarketData marketData = new MarketData();
		marketData.setMarket(market);
		marketData.setClose(BigDecimal.ONE);
		marketData.setOpen(BigDecimal.ONE);
		marketData.setHigh(BigDecimal.ONE);
		marketData.setLow(BigDecimal.ONE);
		marketData.setVolume(BigDecimal.ONE);
		marketData.setStart(start.toInstant(ZoneOffset.UTC));
		marketData.setDirection();
		return marketDataRepository.save(marketData);
		
	}
	
	@Test
	public void testMarketData() {
		Market market = createMarket();
		MarketData marketData1 = createMarketData(market, 0);
		MarketData marketData2 = createMarketData(market, 1);
		Set<MarketData> fromDb = marketDataRepository.findByMarketEquals(market);
		assertEquals(2, fromDb.size());
		assertTrue(fromDb.contains(marketData1));
		assertTrue(fromDb.contains(marketData2));
	}
	
}
