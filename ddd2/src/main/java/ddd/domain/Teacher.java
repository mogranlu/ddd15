package ddd.domain;

import java.util.UUID;

import ddd.Gender;
import ddd.Schedule;
import ddd.exception.DoubleBookingException;

public class Teacher {

	private UUID id;
	private String name;
	private String birthDay;
	private Gender gender;
	private Schedule schedule;

	public Teacher() {
		this.id = UUID.randomUUID();
		this.schedule = new Schedule();
	}

	public void tryEnroll(ddd.domain.Class class1)
			throws DoubleBookingException {
		if (!schedule.canAccept(class1))
			throw new DoubleBookingException("Double booking???");
	}

	public void doEnroll(Class class1) {
		this.schedule.addEnrollment(class1.generateEnrollment(this.id));
	}

	public UUID getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public String getGender() {
		return gender.name();
	}

}
