package five.min.markets.entity;

import java.util.Map;

public enum StatType {

	SLOPE_UP_QUARTILE_REG10(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_10,
			"tiles", 4)),
	SLOPE_DOWN_QUARTILE_REG10(0, Map.of(
			"feature", FeatureType.REGRESSION_SLOPE_10,
			"tiles", 4));
	
	public final Integer order;
	public final Map<String, Object> config;
	
	private StatType(Integer order, Map<String, Object> config) {
		this.order = order;
		this.config = config;
	}
}
