package five.min.markets.entity;

public interface IMarketData {

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
