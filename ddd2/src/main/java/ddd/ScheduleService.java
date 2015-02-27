package ddd;

import ddd.domain.Student;

public class ScheduleService {

    public void enrollStudentInClass(Student student, ddd.domain.Class aClass){

        student.tryEnroll(aClass);
        aClass.tryEnroll();
        student.doEnroll(aClass);
        aClass.doEnroll();

    }

}
