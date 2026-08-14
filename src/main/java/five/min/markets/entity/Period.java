package five.min.markets.entity;

public enum Period {
	FIVE_MINUTES("5m"),
	ONE_SECOND("1s");
	
	public final String binanceValue;
	
	private Period(String binanceValue) {
		this.binanceValue = binanceValue;
	}
}
