package ddd.repository;

import ddd.domain.Student;

import java.util.UUID;

public interface IStudentRepository {
	public boolean hasStudentPaid(UUID studentId);
	public void makePayment(UUID studentId);
	public Student getStudentById(UUID studentId);
	public void save(Student student);
}
