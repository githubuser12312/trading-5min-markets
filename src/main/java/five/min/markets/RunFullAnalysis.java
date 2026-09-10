package five.min.markets;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import five.min.markets.analysis.AnalysisUpdater;
import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.StatType;
import five.min.markets.feature.FeatureMapper;
import five.min.markets.feature.UpdateMarketDataFeatures;
import five.min.markets.pmf.CalculateFeatureProbability;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;
import five.min.markets.stat.CalculateStats;
import lombok.extern.slf4j.Slf4j;

@Component
@Profile("fullAnalysis")
@Slf4j
public class RunFullAnalysis implements CommandLineRunner {

	private MarketRepository marketRepository;
	private MarketDataRepository marketDataRepository;
	private AnalysisUpdater analysisUpdater;
	public RunFullAnalysis(AnalysisUpdater analysisUpdater,
			MarketRepository marketRepository,
			MarketDataRepository marketDataRepository) {
		this.analysisUpdater = analysisUpdater;
		this.marketRepository = marketRepository;
		this.marketDataRepository = marketDataRepository;
	}
	
	@Override
	public void run(String... args) throws Exception {
		List<Market> markets = marketRepository.findAll();
		for(Market market : markets) {
			Pageable marketDataPage = PageRequest.of(0, 1000, Sort.by(Direction.ASC, "start"));
			Page<MarketData> marketDatas = null;
			do {
				marketDatas = marketDataRepository.findByMarketEquals(market, marketDataPage);
				log.info("Processing page {} of {}", marketDataPage.getPageNumber(), marketDatas.getTotalPages());
				for(MarketData marketData : marketDatas) {
					analysisUpdater.updateAnalysis(marketData);
				}
				marketDataPage = marketDataPage.next();
			} while(marketDatas.hasNext());
		}
	}
	

}
