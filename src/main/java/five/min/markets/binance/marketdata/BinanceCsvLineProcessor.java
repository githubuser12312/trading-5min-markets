package five.min.markets.binance.marketdata;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.function.Consumer;

import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketDataRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class BinanceCsvLineProcessor {

	private MarketDataRepository marketDataRepository;
	
	public BinanceCsvLineProcessor(MarketDataRepository marketDataRepository) {
		this.marketDataRepository = marketDataRepository;
	}
	
	public void processCsvLine(String[] line, Market market, Consumer<MarketData> callback) {
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
		data.setPercent();
		data = marketDataRepository.save(data);
		callback.accept(data);
	}
}
