package five.min.markets.repo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.entity.FeatureType;

@SpringBootTest
public class MarketDataFeatureRepositoryTest {

	@Autowired
	private MarketDataFeatureRepository marketDataFeatureRepository;
	
	public MarketDataFeatureRepositoryTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void testNTileQueries() {
		marketDataFeatureRepository.calculateNtileProjectionOverFeatureGreaterThan0(
				4, FeatureType.REGRESSION_SLOPE_10, 1);

		marketDataFeatureRepository.calculateNtileProjectionOverFeatureLessThanOrEqual0(
				4, FeatureType.REGRESSION_SLOPE_10, 1);
	}

}
