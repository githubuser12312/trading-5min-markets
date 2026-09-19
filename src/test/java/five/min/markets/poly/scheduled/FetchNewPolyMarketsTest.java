package five.min.markets.poly.scheduled;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import five.min.markets.poly.config.PolyConfig;
import five.min.markets.poly.entity.PolyBinaryPredictionMarket;
import five.min.markets.poly.repo.PolyBinaryPredictionMarketRepository;

@SpringBootTest
public class FetchNewPolyMarketsTest {

	@Autowired
	private FetchNewPolyMarkets fetchNewPolyMarkets;
	@Autowired
	private PolyConfig polyConfig;
	@Autowired
	private PolyBinaryPredictionMarketRepository polyBinaryPredictionMarketRepository;
	
	@Test
	public void testUpdate() {
		fetchNewPolyMarkets.updateMarkets();
		Page<PolyBinaryPredictionMarket> markets = 
				polyBinaryPredictionMarketRepository.findBinaryPredictionMarketBySeriesSlug("btc-up-or-down-5m", PageRequest.of(0, 100));
		assertNotNull(markets);
		assertFalse(markets.isEmpty());
		assertEquals(12, markets.getNumberOfElements());
	}
}
