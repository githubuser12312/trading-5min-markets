package five.min.markets.entity;

import java.util.Map;
import java.util.stream.Stream;

public enum StatType {

	SLOPE_UP_QUARTILE_REG10(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_10,
			"tiles", 4)),
	SLOPE_DOWN_QUARTILE_REG10(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_10,
			"tiles", 4)),
	SLOPE_UP_QUARTILE_REG20(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_20,
			"tiles", 4)),
	SLOPE_DOWN_QUARTILE_REG20(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_20,
			"tiles", 4)),
	SLOPE_UP_QUARTILE_REG50(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_50,
			"tiles", 4)),
	SLOPE_DOWN_QUARTILE_REG50(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_50,
			"tiles", 4)),
	SLOPE_UP_QUARTILE_REG100(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_100,
			"tiles", 4)),
	SLOPE_DOWN_QUARTILE_REG100(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_100,
			"tiles", 4));
	
	public final Integer order;
	public final Map<String, Object> config;
	
	private StatType(Integer order, Map<String, Object> config) {
		this.order = order;
		this.config = config;
	}
	
	public static Integer maxOrder() {
		return Stream.of(StatType.values()).mapToInt(v -> v.order).max().getAsInt();
	}
}
