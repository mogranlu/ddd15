package ddd;

public class Class {

	private int max;
	private int numberOfStudents;
	
	public Class(int maxNumberOfStudents){
		if (maxNumberOfStudents < 1) {
			throw new ExceedingMaxCapacityException("You cannot create a Class with no capacity!");
		}
		this.max = maxNumberOfStudents;
	}

	public Enrollment doEnroll() {
		if (numberOfStudents >= max) {
			throw new ExceedingMaxCapacityException("Already full! Max = " + max + ". Num of enrolled students = " + numberOfStudents);
		}
		this.numberOfStudents ++;
		return new Enrollment();
	}

	public void tryEnroll() {
		if (numberOfStudents >= max) {
			throw new ExceedingMaxCapacityException("Already full! Max = " + max + ". Num of enrolled students = " + numberOfStudents);
		} 
	}
	
}
