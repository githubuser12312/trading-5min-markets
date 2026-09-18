package five.min.markets.probability;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import five.min.markets.entity.BooleanProbabilityMass;
import five.min.markets.entity.FeatureType;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.ProbabilityMassContainer;
import five.min.markets.entity.ProbabilityMassData;
import five.min.markets.entity.StringProbabilityMass;
import five.min.markets.events.model.RuntimeMarketData;
import five.min.markets.pmf.StringProbabilityCalculator;
import five.min.markets.pool.ObjectPool;
import five.min.markets.pool.ScopedBernoulliBayesModelPool;
import five.min.markets.pool.ScopedProbabilityTableKeyPool;
import five.min.markets.repo.ProbabilityMassContainerRepository;
import jakarta.annotation.PostConstruct;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import net.openhft.chronicle.core.scoped.ScopedResource;
import net.openhft.chronicle.core.scoped.ScopedResourcePool;
import net.openhft.chronicle.core.scoped.ScopedThreadLocal;

@Component
@Slf4j
public class ProbabilityCalculator {

	private ProbabilityMassContainerRepository probabilityMassContainerRepository;
	private Map<ProbabilityTableKey, Double> probabilityLookupTable = new HashMap<>();
	private ScopedResourcePool<BernoulliBayesModel> modelPool = ScopedBernoulliBayesModelPool.createThreadLocal();
	private ScopedResourcePool<ProbabilityTableKey> keyPool = ScopedProbabilityTableKeyPool.createThreadLocal();
	public ProbabilityCalculator(ProbabilityMassContainerRepository probabilityMassContainerRepository) {
		this.probabilityMassContainerRepository = probabilityMassContainerRepository;
	}
	
	public double calculateProbability(RuntimeMarketData runtimeMarketData, MarketDataFeature[] features) {
		try(ScopedResource<BernoulliBayesModel> modelRes = modelPool.get()) {
			BernoulliBayesModel bernoulliBayesModel = modelRes.get();
			bernoulliBayesModel.setPrior(0.5);
			try(ScopedResource<ProbabilityTableKey> keyRes = keyPool.get()) {
				ProbabilityTableKey key = keyRes.get();
				key.setCode(runtimeMarketData.getCode());
				key.setPeriod(runtimeMarketData.getPeriod());
				key.setSource(runtimeMarketData.getSource());
				for(MarketDataFeature feature : features) {
					if(feature == null) continue;
					key.setFeatureType(feature.getFeatureType());
					if(feature.getBooleanValue() != null) {
						key.setValue(feature.getBooleanValue());
					} else if(feature.getStringValue() != null) {
						key.setValue(feature.getStringValue());
					} else if(feature.getIntegerValue() != null) {
						key.setValue(feature.getIntegerValue());
					} else if(feature.getDoubleValue() != null) {
						key.setValue(feature.getDoubleValue());
					} else {
						throw new RuntimeException("Feature does not have a valid value: " + feature);
					}
					if(probabilityLookupTable.containsKey(key)) {
						double probability = probabilityLookupTable.get(key).doubleValue();
						bernoulliBayesModel.addProbability(probability);
					} else {
						log.info("key {} does not map to a probability", key);
					}
				}
				return bernoulliBayesModel.getPosterior();
			}
		}
	}
	
    @EventListener(ApplicationReadyEvent.class)
    @Transactional
	public void constructProbabilityTable() {
		List<ProbabilityMassContainer> containers = probabilityMassContainerRepository.latestProbabilityMassContainers();
		for(ProbabilityMassContainer container : containers) {
			Market market  = container.getMarket().getMarket();
			FeatureType featureType = container.getFeatureType();
			for(ProbabilityMassData pmd : container.getProbabilityMassData()) {
				if(pmd.isLastBarBoolean()) {
					log.info("Skipping prediction bar down on {}", pmd);
					continue;
				}
				Object value = (Object) switch(pmd) {
					case BooleanProbabilityMass b -> Boolean.valueOf(b.isFeatureValue());
					case StringProbabilityMass s -> s.getFeatureValue();
					default -> throw new RuntimeException("Unrecognised probability data type " + pmd.getClass().getSimpleName());
				};
				ProbabilityTableKey key = new ProbabilityTableKey();
				key.setCode(market.getCode());
				key.setPeriod(market.getPeriod());
				key.setSource(market.getSource());
				key.setFeatureType(featureType);
				key.setValue(value);
				probabilityLookupTable.put(key, pmd.getProbability());
			}
		}
		probabilityLookupTable.forEach((k, v) -> System.out.printf("%s : %s%n", k, v));
	}
}
