package ddd1;

import static org.junit.Assert.*;

import org.junit.Test;

import ddd1.Probability;

public class ProbabilityTest {

	@Test(expected = IllegalArgumentException.class)
	public void verifyThatNegativeProbabilitiesInConstructorThrowsException() {
		new Probability(-0.1);
	}

	@Test(expected = IllegalArgumentException.class)
	public void verifyThatProbabilitiesGreaterThanOneInConstructorThrowsException() {
		new Probability(1.5);
	}

	@Test
	public void verifyThatTwoIdenticalInstancesEquals() {
		assertEquals(new Probability(.5), new Probability(.5));
	}

	@Test
	public void verifyHashCode() {
		Probability probability1 = new Probability(0.4);
		Probability probability2 = new Probability(0.4);

		assertTrue(probability1.hashCode() == probability2.hashCode());
	}

	@Test
	public void verifyHashCode2() {
		Probability probability1 = new Probability(0.4);

		assertTrue(probability1.hashCode() == probability1.hashCode());
	}

	@Test
	public void verifyThatCombinedWithGivesTheMultiplum() {
		Probability probability1 = new Probability(0.5);
		Probability probability2 = new Probability(0.5);

		assertEquals(probability1.combinedWith(probability2), new Probability(
				0.5 * 0.5));
	}

	@Test
	public void verifyEither() {
		Probability probability1 = new Probability(0.6);
		Probability probability2 = new Probability(1);
		Probability either = new Probability(1 + 0.6 - 1 * 0.6);

		assertEquals(probability1.either(probability2), either);
	}

}
