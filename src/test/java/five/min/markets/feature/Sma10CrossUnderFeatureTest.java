package five.min.markets.feature;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.bean.override.mockito.MockitoBean;

import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;

@SpringBootTest
public class Sma10CrossUnderFeatureTest {

	@Autowired
	private Sma10CrossUnderFeature sma10CrossUnderFeature;
	@MockitoBean
	private MarketDataFeatureRepository marketDataFeatureRepository;
	public Sma10CrossUnderFeatureTest() {
		// TODO Auto-generated constructor stub
	}

	private MarketData createMarketDataFeature(BigDecimal close) {
		MarketData marketData = new MarketData();
		marketData.setClose(close);
		return marketData;
	}
	
	private List<MarketData> createMarketDataList(int length) {
		List<MarketData> datas = new ArrayList<>();
		for(int i = 0; i < length; i++) {
			datas.add(createMarketDataFeature(BigDecimal.TEN));
		}
		return datas;
	}
	
	@Test
	public void verifyCrossUnderFeature() {
		sma10CrossUnderFeature.reset();
		List<MarketData> marketDatas = createMarketDataList(11);
		marketDatas.forEach(m -> sma10CrossUnderFeature.updateFeature(m));
		MarketDataFeature feature = new MarketDataFeature();
		MarketData marketData = createMarketDataFeature(new BigDecimal(9));
		sma10CrossUnderFeature.updateFeature(marketData);
		marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossUnderFeature.mapFeatureValue(feature, marketData);
		assertTrue(feature.getBooleanValue());
	}
	
	@Test
	public void verifyNoCrossUnderBoundary() {
		sma10CrossUnderFeature.reset();
		List<MarketData> marketDatas = createMarketDataList(11);
		marketDatas.forEach(m -> sma10CrossUnderFeature.updateFeature(m));
		MarketDataFeature feature = new MarketDataFeature();
		MarketData marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossUnderFeature.updateFeature(marketData);
		marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossUnderFeature.mapFeatureValue(feature, marketData);
		assertFalse(feature.getBooleanValue());
		
	}
	
	@Test
	public void verifyOverSma() {
		sma10CrossUnderFeature.reset();
		List<MarketData> marketDatas = createMarketDataList(11);
		marketDatas.forEach(m -> sma10CrossUnderFeature.updateFeature(m));
		MarketDataFeature feature = new MarketDataFeature();
		MarketData marketData = createMarketDataFeature(new BigDecimal(11));
		sma10CrossUnderFeature.updateFeature(marketData);
		marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossUnderFeature.mapFeatureValue(feature, marketData);
		assertFalse(feature.getBooleanValue());
	}
}
