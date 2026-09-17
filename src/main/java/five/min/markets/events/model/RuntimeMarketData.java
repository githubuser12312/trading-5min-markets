package five.min.markets.events.model;

import java.time.Instant;

import five.min.markets.entity.FeatureType;
import five.min.markets.entity.IMarketData;
import five.min.markets.entity.Market;
import five.min.markets.entity.MarketData;
import five.min.markets.entity.MarketDataFeature;
import five.min.markets.entity.Period;
import five.min.markets.entity.Source;
import five.min.markets.pool.Poolable;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import net.openhft.chronicle.wire.SelfDescribingMarshallable;

@Data
@ToString(callSuper = true)
public class RuntimeMarketData extends SelfDescribingMarshallable implements Poolable, IMarketData {

	private String code;
	private Period period;
	private Source source;
	private Instant start;
	private double open;
	private double high;
	private double low;
	private double close;
	private double volume;
	private boolean up;
	private double percent;
	private long eventTime;
	private long candleStart;
	private long candleClose;
	private transient MarketDataFeature[] features;
	
	public MarketDataFeature getFeatureByType(FeatureType type) {
		if(features == null || features.length == 0) return null;
		for(MarketDataFeature feature : features) {
			if(feature != null && feature.getFeatureType() == type) {
				return feature;
			}
		}
		return null;
	}
	
	@Override
	public void reset() {
		this.code = null;
		this.period = null;
		this.source = null;
		this.start = null;
		this.open = 0;
		this.high = 0;
		this.low = 0;
		this.close = 0;
		this.volume = 0;
		this.up = false;
		this.percent = 0;
		this.eventTime = 0;
		this.candleStart = 0;
		this.candleClose = 0;
	}

	@Override
	public Integer getId() {
		return null;
	}

	@Override
	public Boolean getUp() {
		return Boolean.valueOf(up);
	}
}
