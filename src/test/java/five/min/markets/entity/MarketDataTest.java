package five.min.markets.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Set;
import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.repo.MarketDataFeatureRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;

@SpringBootTest
public class MarketDataTest {

	@Autowired
	private MarketRepository marketRepository;
	@Autowired
	private MarketDataRepository marketDataRepository;
	@Autowired
	private MarketDataFeatureRepository marketDataFeatureRepository;
	
	private Market createMarket() {
		Market market = new Market();
		market.setCode(UUID.randomUUID().toString().substring(0, 20));
		market.setSource(Source.BINANCE);
		market.setPeriod(Period.FIVE_MINUTES);
		return marketRepository.save(market);
		
	}
	
	private Instant createInstant(int minutesAgo) {
		return ZonedDateTime.now().minus(minutesAgo, ChronoUnit.MINUTES).withNano(0).toInstant();
	}
	
	private MarketData createMarketData(Market market, Instant start) {
		MarketData marketData = new MarketData();
		marketData.setMarket(market);
		marketData.setClose(BigDecimal.TWO);
		marketData.setOpen(BigDecimal.ONE);
		marketData.setHigh(BigDecimal.ONE);
		marketData.setLow(BigDecimal.ONE);
		marketData.setVolume(BigDecimal.ONE);
		marketData.setStart(start);
		marketData.setDirection();
		return marketDataRepository.save(marketData);
		
	}
	
	private MarketDataFeature createMarketDataFeature(MarketData marketData) {
		MarketDataFeature marketDataFeature = new MarketDataFeature();
		marketDataFeature.setBooleanValue(true);
		marketDataFeature.setMarketData(marketData);
		marketDataFeature.setFeatureType(FeatureType.LAST_BAR_UP);
		return marketDataFeatureRepository.save(marketDataFeature);
	}
	
	@Test
	public void testMarketData() {
		Market market = createMarket();
		MarketData marketData1 = createMarketData(market,createInstant(5));
		MarketData marketData2 = createMarketData(market, createInstant(0));
		Set<MarketData> fromDb = marketDataRepository.findByMarketEquals(market);
		assertEquals(2, fromDb.size());
		assertTrue(fromDb.contains(marketData1));
		assertTrue(fromDb.contains(marketData2));
	}
	
	@Test
	public void testMarketDataFeature() {
		Market market = createMarket();
		MarketData marketData2 = createMarketData(market,createInstant(10));
		MarketData marketData1 = createMarketData(market, createInstant(5));
		MarketData marketData3 = createMarketData(market, createInstant(0));
		MarketDataFeature marketDataFeature2 = createMarketDataFeature(marketData2);
		MarketDataFeature marketDataFeature1 = createMarketDataFeature(marketData1);
		MarketDataFeature marketDataFeature3 = createMarketDataFeature(marketData3);
		Long countFeature = marketDataFeatureRepository.featurePredictionNumerator(marketData3,
				FeatureType.LAST_BAR_UP, 
				true,
				true,
				marketData2.getStart());
		assertEquals(2L, countFeature);
	}
	
	@Test
	public void testMarketDataFeatureCountTotalFeatures() {
		Market market = createMarket();
		MarketData marketData1 = createMarketData(market,  createInstant(10));
		MarketData marketData2 = createMarketData(market,  createInstant(5));
		MarketData marketData3 = createMarketData(market, createInstant(0));
		MarketDataFeature marketDataFeature2 = createMarketDataFeature(marketData1);
		MarketDataFeature marketDataFeature = createMarketDataFeature(marketData2);
		MarketDataFeature marketDataFeature3 = createMarketDataFeature(marketData3);
		long count = marketDataFeatureRepository.featurePredictionDenominator(marketData3, 
				FeatureType.LAST_BAR_UP, true, marketData1.getStart());
		assertEquals(2L, count);
	}
	
}
