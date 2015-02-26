package ddd;

public class ScheduleService {

	public Enrollment enroll(Student student, Class class1) throws RuntimeException {
		class1.tryEnroll();
		student.tryEnroll();
		student.doEnroll();
		return class1.doEnroll();
	}


}
