package five.min.markets.probability;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.pool.Poolable;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class ProbabilityTableKey implements Poolable {

	private String code;
	private Period period;
	private Source source;
	private FeatureType featureType;
	private Object value;
	@Override
	public void reset() {
		this.code = null;
		this.period = null;
		this.source = null;
		this.featureType = null;
		this.value = null;
	}
}
