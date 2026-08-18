package five.min.markets.feature;

import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.repo.MarketDataFeatureRepository;

@Component
public class Sma10CrossUnderFeature extends AbstractSmaFeature {

	private MarketData nowMinus2 = null;
	private MarketData nowMinus1 = null;
	public Sma10CrossUnderFeature(MarketDataFeatureRepository marketDataFeatureRepository) {
		super(FeatureType.SMA_10_CROSS_UNDER, marketDataFeatureRepository);
	}

	@Override
	protected void mapFeatureValue(MarketDataFeature marketDataFeature, MarketData marketData) {
		if(!isFull()) return;
		if(nowMinus1== null) {
			nowMinus1 = marketData;
			return;
		}
		if(nowMinus2 == null) {
			nowMinus2 = nowMinus1;
			nowMinus1 = marketData;
			return;
		}
		if(nowMinus2.getClose().doubleValue() >= getAverage()
				&& nowMinus1.getClose().doubleValue() < getAverage()) {
			marketDataFeature.setBooleanValue(Boolean.TRUE);
		} else {
			marketDataFeature.setBooleanValue(Boolean.FALSE);
		}
		nowMinus2 = nowMinus1;
		nowMinus1 = marketData;
			
	}
	

}
