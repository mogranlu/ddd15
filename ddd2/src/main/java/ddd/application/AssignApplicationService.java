package ddd.application;

import ddd.*;
import ddd.domain.IClassRepository;
import ddd.domain.ITeacherRepository;
import ddd.domain.Teacher;

import java.util.UUID;

public class AssignApplicationService {


	private IClassRepository classRepository;
	private ITeacherRepository teacherRepository;

	public AssignApplicationService(ITeacherRepository teacherRepo, IClassRepository classRepo) {
		classRepository = classRepo;
		teacherRepository = teacherRepo;
	}
	
	public void enroll(UUID teacherId, UUID classId) {
		Teacher teacher = teacherRepository.getTeacherById(teacherId);
		ddd.domain.Class class1 = classRepository.getClassById(classId);

		AssignService assignService = new AssignService(); 
        assignService.assignTeacherToAClass(teacher, class1);
	}
	

	
}
