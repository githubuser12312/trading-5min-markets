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
public class Sma10CrossOverFeatureTest {

	@Autowired
	private Sma10CrossOverFeature sma10CrossOverFeature;
	@MockitoBean
	private MarketDataFeatureRepository marketDataFeatureRepository;
	public Sma10CrossOverFeatureTest() {
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
	public void verifyCrossOverFeature() {
		sma10CrossOverFeature.reset();
		List<MarketData> marketDatas = createMarketDataList(11);
		marketDatas.forEach(m -> sma10CrossOverFeature.updateFeature(m));
		MarketDataFeature feature = new MarketDataFeature();
		MarketData marketData = createMarketDataFeature(new BigDecimal(11));
		sma10CrossOverFeature.updateFeature(marketData);
		marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossOverFeature.mapFeatureValue(feature, marketData);
		assertTrue(feature.getBooleanValue());
	}
	
	@Test
	public void verifyNoCrossOverBoundary() {
		sma10CrossOverFeature.reset();
		List<MarketData> marketDatas = createMarketDataList(11);
		marketDatas.forEach(m -> sma10CrossOverFeature.updateFeature(m));
		MarketDataFeature feature = new MarketDataFeature();
		MarketData marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossOverFeature.updateFeature(marketData);
		marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossOverFeature.mapFeatureValue(feature, marketData);
		assertFalse(feature.getBooleanValue());
		
	}
	
	@Test
	public void verifyUnderSma() {
		sma10CrossOverFeature.reset();
		List<MarketData> marketDatas = createMarketDataList(11);
		marketDatas.forEach(m -> sma10CrossOverFeature.updateFeature(m));
		MarketDataFeature feature = new MarketDataFeature();
		MarketData marketData = createMarketDataFeature(new BigDecimal(9));
		sma10CrossOverFeature.updateFeature(marketData);
		marketData = createMarketDataFeature(new BigDecimal(10));
		sma10CrossOverFeature.mapFeatureValue(feature, marketData);
		assertFalse(feature.getBooleanValue());
	}
}
