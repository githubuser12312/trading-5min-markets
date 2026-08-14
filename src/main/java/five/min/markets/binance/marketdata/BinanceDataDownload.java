package five.min.markets.binance.marketdata;

import java.io.File;
import java.time.LocalDate;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BinanceDataDownload {

	private final BinanceCSVApi binanceCSVApi;
	private final ProcessBinanceCsv processBinanceCsv;
	private final BinanceConfig binanceConfig;
	
	public BinanceDataDownload(BinanceCSVApi binanceCSVApi, ProcessBinanceCsv processBinanceCsv,
			BinanceConfig binanceConfig) {
		super();
		this.binanceCSVApi = binanceCSVApi;
		this.processBinanceCsv = processBinanceCsv;
		this.binanceConfig = binanceConfig;
	}
	
	@Async
	public void getAndSave(LocalDate start) {
		try {
			File csvFile = binanceCSVApi.getCsvFile(binanceConfig.getMarketCode(), binanceConfig.getPeriod(), start);
			if(csvFile != null) {
				log.info("Processing file {}", csvFile.getCanonicalPath());
				processBinanceCsv.processCsv(csvFile, binanceConfig.getMarketCode(), binanceConfig.getPeriod());
				csvFile.delete();
			} 
		} catch (Exception e) {
			log.error("{}", e);
		}
	}
}
