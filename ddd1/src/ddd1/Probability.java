package ddd1;

public class Probability {

	private double probability;

	public Probability(double probability) {
		if (probability < 0.0) {
			throw new IllegalArgumentException("Negative values not allowed!");
		} else if (probability > 1.0) {
			throw new IllegalArgumentException(
					"probability cannot be greater than 1.0!");
		}

		this.probability = probability;
	}

	public Probability combinedWith(Probability other) {
		return new Probability(this.probability * other.probability);
	}

	@Override
	public boolean equals(Object other) {
		return (this.probability == ((Probability) other).probability);
	}

	@Override
	public int hashCode() {
		return Double.valueOf(probability).hashCode();
	}

	public Probability either(Probability probability2) {
		// TODO Auto-generated method stub
		return new Probability(probability + probability2.probability
				- (probability * probability2.probability));
	}
}
