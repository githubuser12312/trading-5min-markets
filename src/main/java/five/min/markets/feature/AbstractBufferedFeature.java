package five.min.markets.feature;

import org.apache.commons.collections.buffer.CircularFifoBuffer;

public abstract class AbstractBufferedFeature {

	protected CircularFifoBuffer buffer;
	
	public AbstractBufferedFeature(int length) {
		this.buffer = new CircularFifoBuffer(length);
	}
	
	protected boolean isFull() {
		return buffer.isFull();
	}
}
