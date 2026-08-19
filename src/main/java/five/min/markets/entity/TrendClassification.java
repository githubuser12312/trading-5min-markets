package five.min.markets.entity;

import java.util.Arrays;
import java.util.stream.Stream;

public enum TrendClassification {

	NO_TREND(new Integer[] {1, 4}, FeatureType.REGRESSION_10_TREND_UP, FeatureType.REGRESSION_10_TREND_DOWN),
	TREND_UP(new Integer[] {2, 3}, FeatureType.REGRESSION_10_TREND_UP),
	STRONG_TREND_UP(new Integer[] {4}, FeatureType.REGRESSION_10_TREND_UP),
	TREND_DOWN(new Integer[] {2, 3}, FeatureType.REGRESSION_10_TREND_DOWN),
	STRONG_TREND_DOWN(new Integer[] {1}, FeatureType.REGRESSION_10_TREND_DOWN);
	
	private Integer[] tiles;
	private FeatureType[] featureTypes;
	
	private TrendClassification(Integer[] tiles, FeatureType...featureTypes) {
		this.tiles = tiles;
		this.featureTypes = featureTypes;
	}
	
	public static TrendClassification trend(Integer tile, FeatureType featureType) {
		return Stream.of(TrendClassification.values())
				.filter(v -> Arrays.binarySearch(v.tiles, tile) >= 0)
				.filter(v -> Arrays.binarySearch(v.featureTypes, featureType) >= 0)
				.findFirst().orElse(null);
	}

	
}
