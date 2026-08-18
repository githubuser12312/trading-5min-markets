package five.min.markets.entity;

import java.util.Map;

public enum FeatureType {

	LAST_BAR_UP(null),
	SMA_10_CROSS_OVER(Map.of("length", 10)),
	SMA_10_CROSS_UNDER(Map.of("length", 10));
	
	public final Map<String, Object> config;
	
	private  FeatureType(Map<String,Object> config) {
		this.config = config;
	}
}
