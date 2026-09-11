package five.min.markets.binance.marketdata;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import five.min.markets.analysis.AnalysisUpdater;
import five.min.markets.entity.Market;
import five.min.markets.entity.Source;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;
import five.min.markets.util.ApplicationContextProvider;
import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.spring.annotation.SchedulerLock;

@Component
@Slf4j
public class BinanceDataDownloadManager {

	private final BinanceDataDownload binanceDataDownload;
	private final BinanceConfig binanceConfig;
	private final MarketRepository marketRepository;
	private final MarketDataRepository marketDataRepository;
	private final BinanceExchangeSync binanceExchangeSync;
	
	public BinanceDataDownloadManager(BinanceDataDownload binanceDataDownload, 
			BinanceConfig binanceConfig,
			MarketRepository marketRepository,
			MarketDataRepository marketDataRepository,
			BinanceExchangeSync binanceExchangeSync) {
		super();
		this.binanceDataDownload = binanceDataDownload;
		this.binanceConfig = binanceConfig;
		this.marketRepository = marketRepository;
		this.marketDataRepository = marketDataRepository;
		this.binanceExchangeSync = binanceExchangeSync;
	}
	
	public void downloadOnly() throws MalformedURLException, IOException, URISyntaxException {
		LocalDate start = binanceConfig.getStart();
		downloadOnly(start, binanceConfig.getEnd());
	}
	
	public void downloadOnly(LocalDate start, LocalDate end) throws MalformedURLException, IOException, URISyntaxException {
		do {
			binanceDataDownload.getAndSaveAsync(start);
			start = start.plusDays(1);
		} while(start.isBefore(end) || start.equals(end));
	}
	
	public void downloadOnlyAndAnalyse(AnalysisUpdater analysisUpdater) throws MalformedURLException, IOException, URISyntaxException {
		LocalDate start = binanceConfig.getStart();
		downloadOnlyAndAnalyse(start, binanceConfig.getEnd(), analysisUpdater);
	}
	
	public void downloadOnlyAndAnalyse(LocalDate start, LocalDate end, AnalysisUpdater analysisUpdater) throws MalformedURLException, IOException, URISyntaxException {
		do {
			binanceDataDownload.getAndSave(start, m -> analysisUpdater.updateAnalysis(m));
			start = start.plusDays(1);
		} while(start.isBefore(end) || start.equals(end));
	}
	
	public void updatedBinanceData() {
		List<Market> binanceMarkets = marketRepository.findMarketBySourceEquals(Source.BINANCE);
		for(Market market : binanceMarkets) {
			AnalysisUpdater analysisUpdater = ApplicationContextProvider.get().getBean(AnalysisUpdater.class);
			try {
				updateMarket(market, analysisUpdater);
			} catch (Exception e) {
				log.error("{}", e);
			}
		}
	}
	
	private void updateMarket(Market market, AnalysisUpdater analysisUpdater) throws MalformedURLException, IOException, URISyntaxException {
		Instant latest = marketDataRepository.findLatestMarketDataForMarket(market);
		LocalDate date = LocalDateTime.ofInstant(latest, ZoneId.of("UTC")).toLocalDate();
		date = date.plusDays(1);
		LocalDate end = LocalDate.now().minusDays(1);
		this.downloadOnlyAndAnalyse(date, end, analysisUpdater);
		this.binanceExchangeSync.synchronizeMarket(market, analysisUpdater);
	}
}
