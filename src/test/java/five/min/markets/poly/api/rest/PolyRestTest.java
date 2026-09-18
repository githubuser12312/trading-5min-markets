package five.min.markets.poly.api.rest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.io.IOException;
import java.time.ZonedDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import five.min.markets.poly.model.market.Market;

@SpringBootTest
public class PolyRestTest {

	@Autowired
	private PolyRest rest;
	
	@Test
	public void testSlug() throws IOException, InterruptedException {
		ZonedDateTime time = ZonedDateTime.now().withMinute(5).withSecond(0);
		String slug = "btc-updown-5m-" + time.toInstant().getEpochSecond();
		System.out.println(slug);
		Market market = rest.getMarketBySlug(slug);
		assertNotNull(market);
		assertEquals(slug, market.getSlug());
	}
	
}
