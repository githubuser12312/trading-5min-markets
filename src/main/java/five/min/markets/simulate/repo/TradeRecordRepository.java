package five.min.markets.simulate.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import five.min.markets.simulate.entity.TradeRecord;

import java.util.List;

public interface TradeRecordRepository extends JpaRepository<TradeRecord, String> {

}