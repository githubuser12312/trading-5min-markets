package five.min.markets.feature;

import org.apache.commons.collections.buffer.CircularFifoBuffer;

import five.min.markets.repo.MarketDataFeatureRepository;

public abstract class AbstractBufferedFeature extends AbstractFeature {

	protected CircularFifoBuffer buffer;
	
	public AbstractBufferedFeature(int length, MarketDataFeatureRepository marketDataFeatureRepository) {
		super(marketDataFeatureRepository);
		this.buffer = new CircularFifoBuffer(length);
	}

	protected boolean isFull() {
		return buffer.isFull();
	}
}
