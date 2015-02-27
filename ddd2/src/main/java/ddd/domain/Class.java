package ddd.domain;

import ddd.Enrollment;
import ddd.exception.ExceedingMaxCapacityException;

import java.util.UUID;

public class Class {

	private int max;
	private int numberOfStudents;

    private UUID id;
    private String name;
    private String teacherName;
    private String location;

    public Class(int maxNumberOfStudents){
		if (maxNumberOfStudents < 1) {
			throw new ExceedingMaxCapacityException("You cannot create a Class with no capacity!");
		}
        this.id = UUID.randomUUID();
		this.max = maxNumberOfStudents;
	}

    public void tryEnroll(){
        if (numberOfStudents == max)
            throw new ExceedingMaxCapacityException("Maximum capacity reached");
    }

    public void doEnroll() {
        if (numberOfStudents == max)
            throw new ExceedingMaxCapacityException("Maximum capacity reached");
        this.numberOfStudents ++;
    }

    public Enrollment generateEnrollment(UUID studentId){
        return new Enrollment(studentId, id, name, teacherName, location);
    }
}
