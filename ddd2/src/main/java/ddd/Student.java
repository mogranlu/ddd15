package ddd;

public class Student {

	private int numberOfClassesInSemester;

	public void tryEnroll() throws DoubleBookingException, MaxNumberOfClassesInSemester {
		if (numberOfClassesInSemester >= 5) {
			throw new MaxNumberOfClassesInSemester("Jalla!");
		}
	}

	public void doEnroll() {
		numberOfClassesInSemester++;
	}

}
