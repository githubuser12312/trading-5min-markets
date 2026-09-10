package five.min.markets.simulate;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EntrySignal {
    
	private final String strategyId;
    private final PositionType positionType; // LONG or SHORT

}
