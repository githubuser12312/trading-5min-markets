package five.min.markets.bayes;

import java.util.ArrayList;
import java.util.List;

public class BernoulliBayesModel {

	private double prior;
	private List<Double> probabilities;
	private double numerator;
	private double complement;
	boolean initialized = false;
	public BernoulliBayesModel(double prior) {
		this.prior = prior;
		this.probabilities = new ArrayList<>();
	}
	
	public void addProbability(Double value) {
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
	
	public double getLikelyhood() {
		return (numerator * prior) / ((numerator*prior) + (complement * (1-prior)));
	}
	
}
