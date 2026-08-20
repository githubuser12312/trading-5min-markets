package five.min.markets.entity;

public enum TrendClassification {

	NO_TREND,
	TREND_UP,
	STRONG_TREND_UP,
	VSTRONG_TREND_UP,
	TREND_DOWN,
	STRONG_TREND_DOWN,
	VSTRONG_TREND_DOWN;
		
	public static TrendClassification trend(Integer tile, final boolean isForUp) {
		if(isForUp && tile == 1) return NO_TREND;
		if(isForUp && tile == 2) return TREND_UP;
		if(isForUp && tile ==3) return STRONG_TREND_UP;
		if(isForUp && tile == 4) return VSTRONG_TREND_UP;
		if(!isForUp && tile == 1) return VSTRONG_TREND_DOWN;
		if(!isForUp && tile == 2) return STRONG_TREND_DOWN;
		if(!isForUp && tile == 3) return TREND_DOWN;
		if(!isForUp && tile == 4) return NO_TREND;
		throw new RuntimeException(String.format("No trend for tile %s and for up %s", tile, isForUp));
	}

	
}
