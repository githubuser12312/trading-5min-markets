package five.min.markets.feature;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.repo.MarketDataRepository;
import five.min.markets.repo.MarketRepository;
import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UpdateMarketDataFeatures {

	private List<FeatureMapper> featureMappers;
	private MarketRepository marketRepository;
	private MarketDataRepository marketDataRepository;
	public UpdateMarketDataFeatures(MarketRepository marketRepository,
			MarketDataRepository marketDataRepository,
			List<FeatureMapper> featureMappers) {
		this.featureMappers = featureMappers;
		this.marketRepository = marketRepository;
		this.marketDataRepository = marketDataRepository;
	}
	
	public void mapFeatures() {
		List<Market> markets = marketRepository.findAll();
		
		for(Market market : markets) {
			Pageable marketDataPage = PageRequest.of(0, 1000, Sort.by(Direction.ASC, "start"));
			Page<MarketData> marketDatas = null;
			do {
				marketDatas = marketDataRepository.findAll(marketDataPage);
				log.info("Processing page {} of {}", marketDataPage.getPageNumber(), marketDatas.getTotalPages());
				for(MarketData data : marketDatas) {
					for(FeatureMapper featureMapper : featureMappers) {
						log.debug("Mapping feature {} for market {} data {}", 
								featureMapper.getClass().getSimpleName(), 
								market.getCode(),
								data.getStart());
						featureMapper.updateFeature(data);
					}
				}
				marketDataPage = marketDataPage.next();
			} while(marketDatas.hasNext());
		}
	}
}
