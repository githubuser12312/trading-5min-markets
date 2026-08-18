package five.min.markets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.binance.marketdata.BinanceDataDownloadManager;

@Component
@Profile(value = {"dataDownload"})
public class BinanceDataDownloader implements CommandLineRunner {


	private final BinanceDataDownloadManager downloandBinanceData;

	public BinanceDataDownloader(BinanceDataDownloadManager downloandBinanceData) {
		this.downloandBinanceData = downloandBinanceData;
	}
	
	@Override
	public void run(String... args) throws Exception {
		downloandBinanceData.downloadAndUpdateData();
	}

}
