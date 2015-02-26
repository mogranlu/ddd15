package ddd.repository;

import java.util.UUID;

import ddd.ICanCheckPaymentStatus;

public class StudentService implements ICanCheckPaymentStatus {

	@Override
	public boolean hasStudentPaid(UUID studentId) {
		return StudentRepository.getInstance().hasStudentPaid(studentId);
	}
	
}
