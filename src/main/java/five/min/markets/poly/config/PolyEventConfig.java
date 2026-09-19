package five.min.markets.poly.config;

import five.min.markets.entity.Period;
import lombok.Data;

@Data
public class PolyEventConfig {

	private String slug;
	private String code;
	private Period period;
}
