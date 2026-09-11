package five.min.markets.binance.marketdata.rest;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.binance.connector.client.common.ApiResponse;
import com.binance.connector.client.common.configuration.ClientConfiguration;
import com.binance.connector.client.spot.rest.SpotRestApiUtil;
import com.binance.connector.client.spot.rest.api.SpotRestApi;
import com.binance.connector.client.spot.rest.model.Interval;
import com.binance.connector.client.spot.rest.model.KlinesItem;
import com.binance.connector.client.spot.rest.model.KlinesResponse;

import five.min.markets.analysis.AnalysisUpdater;
import five.min.markets.binance.marketdata.BinanceCsvLineProcessor;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketDataRepository;

@Component
public class BinanceRestKline {

	private SpotRestApi spotRestApi;
	private MarketDataRepository marketDataRepository;
	
	public BinanceRestKline(MarketDataRepository marketDataRepository) {
		this.marketDataRepository = marketDataRepository;
		ClientConfiguration clientConfiguration = SpotRestApiUtil.getClientConfiguration();
		spotRestApi = new SpotRestApi(clientConfiguration);
	}
	
	public List<String[]> getData(Market market) {
		Instant latest = marketDataRepository.findLatestMarketDataForMarket(market);
		long start = latest.toEpochMilli() + 1;
		long end = System.currentTimeMillis();
		ApiResponse<KlinesResponse> klines = spotRestApi.klines(market.getCode(), 
				Interval.fromValue(market.getPeriod().binanceValue.getValue()), 
				start, 
				end, 
				"0", 
				null);
		if(klines.getData() == null || klines.getData().isEmpty()) return Collections.emptyList();
		List<String[]> items = new ArrayList<>();
		KlinesResponse response = klines.getData();
		for(KlinesItem item : response) {
			String[] data = item.toArray(new String[] {});
			items.add(data);
		}
		return items;
	}
}
