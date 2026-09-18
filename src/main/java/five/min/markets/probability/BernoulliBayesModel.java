package five.min.markets.probability;

import java.util.ArrayList;
import java.util.List;

import five.min.markets.pool.Poolable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BernoulliBayesModel implements Poolable {

	private double prior;
	private List<Double> probabilities;
	private double numerator;
	private double complement;
	boolean initialized = false;
	
	public BernoulliBayesModel() {
		this(0);
	}
	
	public BernoulliBayesModel(double prior) {
		this.prior = prior;
		this.probabilities = new ArrayList<>();
	}
	
	public void addProbability(double value) {
		if(!initialized) {
			numerator = value;
			complement = 1 - value;
			initialized = true;
		} else {
			numerator *= value;
			complement *= (1-value);
		}
		probabilities.add(value);
	}
	
	public double getPosterior() {
		return (numerator * prior) / ((numerator*prior) + (complement * (1-prior)));
	}

	@Override
	public void reset() {
		prior = 0;
		probabilities.clear();
		numerator = 0;
		complement = 0;
		initialized = false;
	}
	
}
