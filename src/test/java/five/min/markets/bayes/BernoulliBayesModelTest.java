package five.min.markets.bayes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BernoulliBayesModelTest {

	@Test
	public void testBenoulli_50_50() {
		BernoulliBayesModel bernoulliBayesModel = new BernoulliBayesModel(0.5);
		bernoulliBayesModel.addProbability(0.5);
		assertEquals(0.5, bernoulliBayesModel.getPosterior(), 0.0);
	}
	
	@Test
	public void testBenoulli_50_then_60() {
		BernoulliBayesModel bernoulliBayesModel = new BernoulliBayesModel(0.5);
		bernoulliBayesModel.addProbability(0.6);
		assertEquals(0.6, bernoulliBayesModel.getPosterior(), 0.0);
	}
	
	@Test
	public void testBenoulli_50_then_60_then_30() {
		BernoulliBayesModel bernoulliBayesModel = new BernoulliBayesModel(0.5);
		bernoulliBayesModel.addProbability(0.6);
		bernoulliBayesModel.addProbability(0.3);
		assertEquals(0.3913, bernoulliBayesModel.getPosterior(), 0.0001);
	}
	
	@Test
	public void testBenoulli_50_then_60_then_30_then_1() {
		BernoulliBayesModel bernoulliBayesModel = new BernoulliBayesModel(0.5);
		bernoulliBayesModel.addProbability(0.6);
		bernoulliBayesModel.addProbability(0.3);
		bernoulliBayesModel.addProbability(1.0);
		assertEquals(1.0, bernoulliBayesModel.getPosterior(), 0.0);
	}
	
	@Test
	public void testBenoulli_50_then_60_then_30_then_0() {
		BernoulliBayesModel bernoulliBayesModel = new BernoulliBayesModel(0.5);
		bernoulliBayesModel.addProbability(0.6);
		bernoulliBayesModel.addProbability(0.3);
		bernoulliBayesModel.addProbability(0.0);
		assertEquals(0.0, bernoulliBayesModel.getPosterior(), 0.0);
	}
}
