package five.min.markets.binance.marketdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

import org.springframework.resilience.annotation.Retryable;
import org.springframework.stereotype.Repository;

import com.opencsv.CSVReader;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;

@Repository
public class ProcessBinanceCsv {

	private MarketRepository marketRepository;
	private MarketDataRepository marketDataRepository;
	
	public ProcessBinanceCsv(MarketRepository marketRepository, MarketDataRepository marketDataRepository) {
		this.marketDataRepository = marketDataRepository;
		this.marketRepository = marketRepository;
	}

	@Retryable
	public void processCsv(File csv, String code, Period period) throws FileNotFoundException, IOException {
		Market market = marketRepository.findBySourceEqualsAndCodeEqualsAndPeriodEquals(Source.BINANCE, code, period);
		if(market == null) {
			market = new Market();
			market.setCode(code);
			market.setSource(Source.BINANCE);
			market.setPeriod(period);
			market = marketRepository.save(market);
		}
		readCsv(csv, market);
		
	} 
	
	private void readCsv(File file, Market market) throws FileNotFoundException, IOException {
		try(CSVReader csvReader = new CSVReader(new FileReader(file))) {
			csvReader.forEach(line -> {
				boolean isMicroSeconds = line[0].length() > 13;
				Long time = Long.parseLong(line[0]);
				if(isMicroSeconds) {
					time = time / 1000; // format is microseconds
				}
				Instant instant = Instant.ofEpochMilli(time);
				BigDecimal open = new BigDecimal(line[1]);
				BigDecimal high = new BigDecimal(line[2]);
				BigDecimal low = new BigDecimal(line[3]);
				BigDecimal close = new BigDecimal(line[4]);
				BigDecimal volume = new BigDecimal(line[5]);
				MarketData data = marketDataRepository.findByMarketEqualsAndStartEquals(market, instant);
				if(data == null) {
					data = new MarketData();
				}
				data.setMarket(market);
				data.setStart(instant);
				data.setOpen(open);
				data.setClose(close);
				data.setHigh(high);
				data.setLow(low);
				data.setVolume(volume);
				data.setDirection();
				marketDataRepository.save(data);
			});
		}
	}
}
