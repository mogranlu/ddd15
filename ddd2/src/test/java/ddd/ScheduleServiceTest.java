package ddd;

import ddd.domain.Class;
import ddd.domain.Student;
import ddd.exception.ExceedingMaxCapacityException;
import org.junit.Test;


public class ScheduleServiceTest {
	@Test
	public void testSchedulerObjectInstanciation() {
		ScheduleService scheduler = new ScheduleService();
		scheduler.enrollStudentInClass(new Student(), new ddd.domain.Class(10));
	}

	@Test(expected = ExceedingMaxCapacityException.class)
	public void testSchedulerObjectInstanciationFailsWhenMaxCapacityReached() {
		ScheduleService scheduler = new ScheduleService();
		Class class1 = new Class(10);
		for (int i = 0; i < 11; i++) {
			scheduler.enrollStudentInClass(new Student(), class1);
		}
	}
}
