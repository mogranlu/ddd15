package ddd;

public class ScheduleService {

    public void enrollStudentInClass(Student student, Class aClass){

        student.tryEnroll(aClass);
        aClass.tryEnroll();
        student.doEnroll(aClass);
        aClass.doEnroll();

    }

}
