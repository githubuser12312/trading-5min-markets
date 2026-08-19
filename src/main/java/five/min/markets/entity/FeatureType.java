package five.min.markets.entity;

import java.util.Map;
import java.util.stream.Stream;

public enum FeatureType {

	LAST_BAR_UP(0, null),
	SMA_10_CROSS_OVER(0, Map.of("length", 10)),
	SMA_10_CROSS_UNDER(0, Map.of("length", 10)),
	REGRESSION_SLOPE_10(0, Map.of("length", 10)),
	REGRESSION_10_TREND_UP(1, Map.of("isDown", Boolean.FALSE)),
	REGRESSION_10_TREND_DOWN(1, Map.of("isDown", Boolean.TRUE));
	
	public final Map<String, Object> config;
	public final Integer order;
	
	private  FeatureType(Integer order, Map<String,Object> config) {
		this.order = order;
		this.config = config;
	}
	
	public static Integer maxOrder() {
		return Stream.of(FeatureType.values()).mapToInt(f -> f.order).max().getAsInt();
	}
	
	public static Integer minOrder() {
		return Stream.of(FeatureType.values()).mapToInt(f -> f.order).min().getAsInt();
	}
	
	public static FeatureType[] byOrder(Integer order) {
		return (FeatureType[]) Stream.of(FeatureType.values()).filter(f -> f.order == order).toArray();
	}
}
