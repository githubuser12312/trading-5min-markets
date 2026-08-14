package five.min.markets.binance.marketdata;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import five.min.markets.entity.Period;

public class CsvDownloanUrlTest {

	@Test
	public void testGenerateUrl() {
		LocalDate date = LocalDate.of(2026, 7, 14); 
		String code = "BTCUSDC";
		CsvDownloanUrl csvDownloanUrl = new CsvDownloanUrl();
		csvDownloanUrl.setCode(code);
		csvDownloanUrl.setTimePeriod(Period.FIVE_MINUTES);
		csvDownloanUrl.setDate(date);
		String url = csvDownloanUrl.toString();
		assertEquals("https://data.binance.vision/data/spot/daily/klines/BTCUSDC/5m/BTCUSDC-5m-2026-07-14.zip", url);
		assertEquals("https://data.binance.vision/data/spot/daily/klines/BTCUSDC/5m/BTCUSDC-5m-2026-07-14.zip.CHECKSUM", csvDownloanUrl.toCheckSumUrl());
	}
}
