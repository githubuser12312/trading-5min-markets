package five.min.markets.entity;

import java.time.Instant;

public interface IMarketData {
	Integer getId();
	Instant getStart();
	String getCode();
	Period getPeriod();
	Source getSource();
	double getOpen();
	double getHigh();
	double getLow();
	double getClose();
	Boolean getUp();
	double getPercent();
	default long getCandleStart() {
		return 0;
	}
	default long getCandleClose() {
		return 0;
	}
	default long getEventTime() {
		return 0;
	}
}
