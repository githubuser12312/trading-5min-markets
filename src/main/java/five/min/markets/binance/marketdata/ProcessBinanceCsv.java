package five.min.markets.binance.marketdata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;
import java.util.function.Consumer;

import org.springframework.resilience.annotation.Retryable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.opencsv.CSVReader;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;

@Component
public class ProcessBinanceCsv {

	private MarketRepository marketRepository;
	private BinanceCsvLineProcessor binanceCsvLineProcessor;
	
	public ProcessBinanceCsv(MarketRepository marketRepository, BinanceCsvLineProcessor binanceCsvLineProcessor) {
		this.binanceCsvLineProcessor = binanceCsvLineProcessor;
		this.marketRepository = marketRepository;
	}

	@Retryable
	public void processCsv(File csv, String code, Period period, Consumer<MarketData> callback) throws FileNotFoundException, IOException {
		Market market = marketRepository.findBySourceEqualsAndCodeEqualsAndPeriodEquals(Source.BINANCE, code, period);
		if(market == null) {
			market = new Market();
			market.setCode(code);
			market.setSource(Source.BINANCE);
			market.setPeriod(period);
			market = marketRepository.save(market);
		}
		readCsv(csv, market, callback);
		
	} 
	
	private void readCsv(File file, Market market, Consumer<MarketData> callback) throws FileNotFoundException, IOException {
		try(CSVReader csvReader = new CSVReader(new FileReader(file))) {
			csvReader.forEach(line -> {
				binanceCsvLineProcessor.processCsvLine(line, market, callback);
			});
		}
	}
}
