package five.min.markets.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.hibernate.annotations.Audited;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.repo.BarBeforeProbabilityMassRepository;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import five.min.markets.repo.ProbabilityMassDataRepository;

@SpringBootTest
public class BarBeforeProbabilityMassTest {

	@Autowired
	private BarBeforeProbabilityMassRepository barBeforeProbabilityMassRepository;
	@Autowired
	private ProbabilityMassContainerRepository probabilityMassContainerRepository;
	@Autowired
	private MarketRepository marketRepository;
	
	@Autowired
	private ProbabilityMassDataRepository probabilityMassDataRepository;
	
	private Market createMarket() {
		Market market = new Market();
		market.setCode(UUID.randomUUID().toString().substring(0, 20));
		market.setSource(Source.BINANCE);
		market.setPeriod(Period.FIVE_MINUTES);
		return marketRepository.save(market);
		
	}
	
	private ProbabilityMassContainer createProbabilityMassContainer(Market market) {
		ProbabilityMassContainer probabilityMassContainer = new ProbabilityMassContainer();
		probabilityMassContainer.setFeatureType(FeatureType.LAST_BAR_UP);
		probabilityMassContainer.setMarket(market);
		return probabilityMassContainerRepository.save(probabilityMassContainer);
	}
	
	private BarBeforeProbabilityMass createBarBeforeProbabilityMass(ProbabilityMassContainer probabilityMassContainer) {
		BarBeforeProbabilityMass barBeforeProbabilityMass = new BarBeforeProbabilityMass();
		barBeforeProbabilityMass.setCurrentBarUp(true);
		barBeforeProbabilityMass.setDenominator(200L);
		barBeforeProbabilityMass.setLastBarUp(true);
		barBeforeProbabilityMass.setNumerator(100L);
		barBeforeProbabilityMass.setProbabilityMassContainer(probabilityMassContainer);
		return probabilityMassDataRepository.save(barBeforeProbabilityMass);
	}
	
	@Test
	public void testBarBeforeProbabilityMass() {
		Market market = createMarket();
		ProbabilityMassContainer probabilityMassContainer = createProbabilityMassContainer(market);
		BarBeforeProbabilityMass barBeforeProbabilityMass = createBarBeforeProbabilityMass(probabilityMassContainer);
		assertNotNull(barBeforeProbabilityMass);
		assertNotNull(barBeforeProbabilityMass.getProbability());
		assertEquals(0.5, barBeforeProbabilityMass.getProbability());
		assertEquals(100L, barBeforeProbabilityMass.getNumerator());
		assertEquals(200L, barBeforeProbabilityMass.getDenominator());
		assertTrue(barBeforeProbabilityMass.isCurrentBarUp());
		assertTrue(barBeforeProbabilityMass.isLastBarUp());
	}
}
