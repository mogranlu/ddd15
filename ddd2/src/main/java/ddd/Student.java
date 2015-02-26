package ddd;

import java.util.UUID;

public class Student {

	private int numberOfClassesInSemester;
	private UUID id;
	private Schedule schedule;

    public Student(){
        this.id = UUID.randomUUID();
        this.schedule = new Schedule();
    }
    public void tryEnroll(Class class1) throws DoubleBookingException {
        if (!schedule.canAccept(class1)) throw new DoubleBookingException("Double booking???");
    }

    public void doEnroll(Class class1){
        this.schedule.addEnrollment(class1.generateEnrollment(this.id));
    }
}
