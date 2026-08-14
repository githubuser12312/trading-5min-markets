package five.min.markets.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import five.min.markets.entity.Market;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;

@Repository
public interface MarketRepository extends JpaRepository<Market, Integer> {

	Market findBySourceEqualsAndCodeEqualsAndPeriodEquals(Source source, String code, Period period);
}
