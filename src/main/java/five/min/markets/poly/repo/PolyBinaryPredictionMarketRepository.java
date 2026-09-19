package five.min.markets.poly.repo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.poly.entity.PolyBinaryPredictionMarket;

public interface PolyBinaryPredictionMarketRepository extends JpaRepository<PolyBinaryPredictionMarket, Integer> {

	PolyBinaryPredictionMarket findBinaryPredictionMarketBySlug(String slug);
	
	Page<PolyBinaryPredictionMarket> findBinaryPredictionMarketBySeriesSlug(String eventSlug, Pageable pageable);
}
