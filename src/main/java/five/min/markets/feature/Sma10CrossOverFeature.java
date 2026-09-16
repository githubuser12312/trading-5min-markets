package five.min.markets.feature;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.pool.ObjectPoolFactory;
import five.min.markets.repo.MarketDataFeatureRepository;

@Component
@Scope("prototype")
public class Sma10CrossOverFeature extends AbstractSmaFeature {

	private IMarketData nowMinus2 = null;
	private IMarketData nowMinus1 = null;
	public Sma10CrossOverFeature(MarketDataFeatureRepository marketDataFeatureRepository,
			ObjectPoolFactory objectPoolFactory) {
		super(FeatureType.SMA_10_CROSS_OVER, marketDataFeatureRepository, objectPoolFactory);
	}

	@Override
	protected void mapFeatureValue(MarketDataFeature marketDataFeature, IMarketData marketData) {
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
		if(nowMinus2.getClose() <= getAverage()
				&& nowMinus1.getClose() > getAverage()) {
			marketDataFeature.setBooleanValue(Boolean.TRUE);
		} else {
			marketDataFeature.setBooleanValue(Boolean.FALSE);
		}
		nowMinus2 = nowMinus1;
		nowMinus1 = marketData;
	}


	
}
