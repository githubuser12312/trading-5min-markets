package five.min.markets.binance.marketdata;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import five.min.markets.analysis.AnalysisUpdater;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BinanceDataDownloadManager {

	private final BinanceDataDownload binanceDataDownload;
	private final BinanceConfig binanceConfig;
	private final AnalysisUpdater analysisUpdater;
	
	public BinanceDataDownloadManager(BinanceDataDownload binanceDataDownload, 
			BinanceConfig binanceConfig,
			AnalysisUpdater analysisUpdater) {
		super();
		this.binanceDataDownload = binanceDataDownload;
		this.binanceConfig = binanceConfig;
		this.analysisUpdater = analysisUpdater;
	}
	
	public void downloadOnly() throws MalformedURLException, IOException, URISyntaxException {
		LocalDate start = binanceConfig.getStart();
		do {
			binanceDataDownload.getAndSaveAsync(start);
			start = start.plusDays(1);
		} while(start.isBefore(binanceConfig.getEnd()) || start.equals(binanceConfig.getEnd()));
	}
	
	public void downloadOnlyAndAnalyse() throws MalformedURLException, IOException, URISyntaxException {
		LocalDate start = binanceConfig.getStart();
		do {
			binanceDataDownload.getAndSave(start, m -> analysisUpdater.updateAnalysis(m));
			start = start.plusDays(1);
		} while(start.isBefore(binanceConfig.getEnd()) || start.equals(binanceConfig.getEnd()));
	}
}
