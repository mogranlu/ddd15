package ddd;

import java.util.UUID;

import ddd.ICanCheckPaymentStatus;
import ddd.repository.StudentRepository;

public class StudentService implements ICanCheckPaymentStatus {

	@Override
	public boolean hasStudentPaid(UUID studentId) {
		return StudentRepository.getInstance().hasStudentPaid(studentId);
	}
	
}
