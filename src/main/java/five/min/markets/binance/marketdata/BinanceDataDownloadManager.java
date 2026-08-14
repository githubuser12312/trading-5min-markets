package five.min.markets.binance.marketdata;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.LocalDate;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BinanceDataDownloadManager {

	private final BinanceDataDownload binanceDataDownload;
	private final BinanceConfig binanceConfig;
	
	public BinanceDataDownloadManager(BinanceDataDownload binanceDataDownload, BinanceConfig binanceConfig) {
		super();
		this.binanceDataDownload = binanceDataDownload;
		this.binanceConfig = binanceConfig;
	}
	
	public void downloadAndUpdateData() throws MalformedURLException, IOException, URISyntaxException {
		LocalDate start = binanceConfig.getStart();
		do {
			binanceDataDownload.getAndSave(start);
			start = start.plusDays(1);
		} while(start.isBefore(binanceConfig.getEnd()) || start.equals(binanceConfig.getEnd()));
	}
}
