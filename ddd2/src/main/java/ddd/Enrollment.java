package ddd;

import java.util.UUID;

public class Enrollment {

	private UUID classID;
	private UUID studentId;
	private String className;
	private String teacherName;
	private String location;

    public Enrollment(UUID studentId, UUID classId, String className, String teacherName, String location) {
    	this.studentId = studentId; 
    	this.classID = classId;
    	this.className = className;
    	this.teacherName = teacherName;
    	this.location = location;
    }

}
