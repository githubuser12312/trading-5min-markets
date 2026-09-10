package five.min.markets.binance.marketdata.scheduled;


import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import five.min.markets.binance.marketdata.BinanceDataDownloadManager;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
@Slf4j
public class UpdateDataAndAnalysis {

	private final BinanceDataDownloadManager binanceDataDownloadManager;
	public UpdateDataAndAnalysis(BinanceDataDownloadManager binanceDataDownloadManager) {
		this.binanceDataDownloadManager = binanceDataDownloadManager;
	}
	
	@Scheduled(cron = "0 5 0 * * *")
	@SchedulerLock(name = "UpdateDataAndAnalysis", 
		      lockAtLeastFor = "PT25M", lockAtMostFor = "PT6H")
	public void updatedBinanceData() {
		binanceDataDownloadManager.updatedBinanceData();
	}

}
