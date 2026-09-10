package five.min.markets;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import five.min.markets.binance.marketdata.BinanceDataDownloadManager;
@Component
@Profile(value = {"dataDownloadAndAnalyse"})
public class DownloadAndAnalyse implements CommandLineRunner {

	private final BinanceDataDownloadManager downloandBinanceData;

	public DownloadAndAnalyse(BinanceDataDownloadManager downloandBinanceData) {
		this.downloandBinanceData = downloandBinanceData;
	}
	
	@Override
	public void run(String... args) throws Exception {
		downloandBinanceData.updatedBinanceData();
	}

}
