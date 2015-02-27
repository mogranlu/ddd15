package ddd;

import java.util.UUID;

public class EnrollApplicationService {
	private IClassRepository classRepository;
	private IStudentRepository studentRepository;
	private ScheduleService scheduleService;
	private ICanCheckPaymentStatus paymentStatusChecker;

	public EnrollApplicationService(IStudentRepository studRepo, IClassRepository classRepo, ICanCheckPaymentStatus paymentChecker) {
		classRepository = classRepo;
		studentRepository = studRepo;
		paymentStatusChecker = paymentChecker;
	}
	
	public void enroll(UUID studentId, UUID classId) {
		Student s = studentRepository.getStudentById(studentId);
		
		
	}
	
	
}
