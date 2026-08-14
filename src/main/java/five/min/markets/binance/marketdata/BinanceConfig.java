package five.min.markets.binance.marketdata;

import java.time.LocalDate;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import five.min.markets.entity.Period;
import lombok.Data;

@Component
@ConfigurationProperties(prefix = "binance.dl.config")
@Data
public class BinanceConfig {

	private Period period;
	private LocalDate start;
	private LocalDate end;
	private String marketCode;
}
