package ddd;

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
		Class class1 = classRepository.getClassById(classId);

		AssignService assignService = new AssignService(); 
        assignService.assignTeacherToAClass(teacher, class1);
	}
	

	
}
