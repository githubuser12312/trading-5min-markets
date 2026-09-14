package five.min.markets.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

import org.hibernate.annotations.Audited;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.repo.BooleanProbabilityMassRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.ProbabilityMassDataRepository;

@SpringBootTest
public class BooleanProbabilityMassTest {

	@Autowired
	private BooleanProbabilityMassRepository barBeforeProbabilityMassRepository;
	@Autowired
	private ProbabilityMassContainerRepository probabilityMassContainerRepository;
	@Autowired
	private MarketRepository marketRepository;
	@Autowired
	private MarketDataRepository marketDataRepository;
	
	@Autowired
	private ProbabilityMassDataRepository probabilityMassDataRepository;
	
	private MarketData createMarket() {
		Market market = new Market();
		market.setCode(UUID.randomUUID().toString().substring(0, 20));
		market.setSource(Source.BINANCE);
		market.setPeriod(Period.FIVE_MINUTES);
		MarketData marketData = new MarketData();
		marketData.setStart(Instant.now());
		marketData.setHigh(1.0);
		marketData.setLow(1.0);
		marketData.setOpen(1.0);
		marketData.setClose(1.0);
		marketData.setUp(false);
		marketData.setVolume(1.0);
		market = marketRepository.save(market);
		marketData.setMarket(market);
		return marketDataRepository.save(marketData);
		
	}
	
	private ProbabilityMassContainer createProbabilityMassContainer(MarketData market) {
		ProbabilityMassContainer probabilityMassContainer = new ProbabilityMassContainer();
		probabilityMassContainer.setFeatureType(FeatureType.LAST_BAR_UP);
		probabilityMassContainer.setMarket(market);
		return probabilityMassContainerRepository.save(probabilityMassContainer);
	}
	
	private BooleanProbabilityMass createBarBeforeProbabilityMass(ProbabilityMassContainer probabilityMassContainer) {
		BooleanProbabilityMass barBeforeProbabilityMass = new BooleanProbabilityMass();
		barBeforeProbabilityMass.setFeatureValue(true);
		barBeforeProbabilityMass.setDenominator(200L);
		barBeforeProbabilityMass.setLastBarBoolean(true);
		barBeforeProbabilityMass.setNumerator(100L);
		barBeforeProbabilityMass.setProbabilityMassContainer(probabilityMassContainer);
		return probabilityMassDataRepository.save(barBeforeProbabilityMass);
	}
	
	@Test
	public void testBarBeforeProbabilityMass() {
		MarketData market = createMarket();
		ProbabilityMassContainer probabilityMassContainer = createProbabilityMassContainer(market);
		BooleanProbabilityMass barBeforeProbabilityMass = createBarBeforeProbabilityMass(probabilityMassContainer);
		assertNotNull(barBeforeProbabilityMass);
		assertNotNull(barBeforeProbabilityMass.getProbability());
		assertEquals(0.5, barBeforeProbabilityMass.getProbability());
		assertEquals(100L, barBeforeProbabilityMass.getNumerator());
		assertEquals(200L, barBeforeProbabilityMass.getDenominator());
		assertTrue(barBeforeProbabilityMass.isFeatureValue());
		assertTrue(barBeforeProbabilityMass.isLastBarBoolean());
	}
}
