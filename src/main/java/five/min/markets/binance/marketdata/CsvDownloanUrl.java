package five.min.markets.binance.marketdata;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import five.min.markets.entity.Period;
import lombok.Getter;
import lombok.Setter;
public class CsvDownloanUrl {

	private DateTimeFormatter formatter = DateTimeFormatter.ISO_LOCAL_DATE;
	@Getter @Setter
	private LocalDate date;
	@Getter @Setter
	private Period timePeriod;
	@Getter @Setter
	private String code;
	private String baseUrl = "https://data.binance.vision/data/spot/daily/klines/{code}/{period}/{code}-{period}-{yyyy-MM-dd}.zip";
	//https://data.binance.vision/data/spot/daily/klines/BTCUSDC/5m/BTCUSDC-5m-2026-07-14.zip
	
	public String toString() {
		return baseUrl.replace("{code}", code)
				.replace("{period}", timePeriod.binanceValue)
				.replace("{yyyy-MM-dd}", formatter.format(date));
	}
	
	public String toCheckSumUrl() {
		return toString() + ".CHECKSUM";
	}
}
