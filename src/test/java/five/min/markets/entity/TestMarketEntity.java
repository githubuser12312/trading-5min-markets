package five.min.markets.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.repo.MarketRepository;

@SpringBootTest
public class TestMarketEntity {

	@Autowired
	private MarketRepository marketRepository;
	
	@Test
	public void testMarketEntity() {
		Market market = new Market();
		market.setCode(UUID.randomUUID().toString().substring(0, 20));
		market.setSource(Source.BINANCE);
		market.setPeriod(Period.FIVE_MINUTES);
		market = marketRepository.save(market);
		assertNotNull(market.getId());
		
		Market fromDb = marketRepository.findBySourceEqualsAndCodeEqualsAndPeriodEquals(market.getSource(), market.getCode(), Period.FIVE_MINUTES);
		assertNotNull(fromDb);
		assertEquals(market.getId(), fromDb.getId());
	}
}
