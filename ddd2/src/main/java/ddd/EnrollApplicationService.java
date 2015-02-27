package ddd;

import java.util.UUID;

public class EnrollApplicationService {
	private IClassRepository classRepository;
	private IStudentRepository studentRepository;
	private ICanCheckPaymentStatus paymentStatusChecker;

	public EnrollApplicationService(IStudentRepository studRepo, IClassRepository classRepo, ICanCheckPaymentStatus paymentChecker) {
		classRepository = classRepo;
		studentRepository = studRepo;
		paymentStatusChecker = paymentChecker;
	}
	
	public void enroll(UUID studentId, UUID classId) {
		Student s = studentRepository.getStudentById(studentId);
		Class class1 = classRepository.getClassById(classId);

        ScheduleService scheduleService1 = new ScheduleService();
        scheduleService1.enrollStudentInClass(s, class1);
	}
	
	
}
