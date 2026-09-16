package five.min.markets.repo;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

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
				4, FeatureType.REGRESSION_SLOPE_10, 1, 
				LocalDateTime.now().minusDays(1).toInstant(ZoneOffset.UTC), Instant.now());

		marketDataFeatureRepository.calculateNtileProjectionOverFeatureLessThanOrEqual0(
				4, FeatureType.REGRESSION_SLOPE_10, 1, 
				LocalDateTime.now().minusDays(1).toInstant(ZoneOffset.UTC), Instant.now());
	}

}
