package ddd.application;

import ddd.*;
import ddd.repository.IClassRepository;
import ddd.repository.IStudentRepository;

import java.util.UUID;

public class EnrollApplicationService {
	private IClassRepository classRepository;
	private IStudentRepository studentRepository;

	public EnrollApplicationService(IStudentRepository studRepo, IClassRepository classRepo) {
		classRepository = classRepo;
		studentRepository = studRepo;
	}
	
	public void enroll(UUID studentId, UUID classId) {
		Student s = studentRepository.getStudentById(studentId);
		ddd.Class class1 = classRepository.getClassById(classId);

        ScheduleService scheduleService1 = new ScheduleService();
        scheduleService1.enrollStudentInClass(s, class1);
	}
	
	
}
