package ddd;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

    private final int maxClasses = 5;

    private List<Enrollment> enrollmentList;

    public Schedule(){
        this.enrollmentList = new ArrayList<Enrollment>();
    }

    public boolean canAccept(Class class1) {
        return this.enrollmentList.size() < this.maxClasses;
    }

    public void addEnrollment(Enrollment enrollment) {
        this.enrollmentList.add(enrollment);
    }
}
