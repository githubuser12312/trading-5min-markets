package five.min.markets.binance.marketdata;

import java.io.File;
import java.time.LocalDate;
import java.util.function.Consumer;

import org.springframework.resilience.annotation.Retryable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import five.min.markets.entity.MarketData;
import jakarta.transaction.Transactional;
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
	
	@Retryable
	@Transactional
	public void getAndSave(LocalDate start, Consumer<MarketData> callback) {
		File csvFile = null;
		try {
			csvFile = binanceCSVApi.getCsvFile(binanceConfig.getMarketCode(), binanceConfig.getPeriod(), start);
			if(csvFile != null) {
				log.info("Processing file {}", csvFile.getCanonicalPath());
				processBinanceCsv.processCsv(csvFile, binanceConfig.getMarketCode(), binanceConfig.getPeriod(), callback);
			} 
		} catch (Exception e) {
			log.error("{}", e);
			throw new RuntimeException(e);
		} finally {
			if(csvFile != null) {
				csvFile.delete();
			}
		}
	}
	
	@Async
	@Retryable
	@Transactional
	public void getAndSaveAsync(LocalDate start) {
		getAndSave(start, (m) -> {});
	}
}
