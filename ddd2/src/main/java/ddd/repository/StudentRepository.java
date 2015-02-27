package ddd.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import ddd.domain.Student;

public class StudentRepository implements IStudentRepository {

	private static StudentRepository instance = null;
	private Map<UUID, Boolean> paymentDB;
	private Map<UUID, Student> students;

	private StudentRepository() {
		if (paymentDB == null) {
			paymentDB = new HashMap<>();
		}
		if (students == null) {
			students = new HashMap<>();
		}
	}

	@Override
	public boolean hasStudentPaid(UUID studentId) {
		return paymentDB.get(studentId) != null && paymentDB.get(studentId);
	}

	@Override
	public void makePayment(UUID studentId) {
		paymentDB.put(studentId, true);
	}

	public static StudentRepository getInstance() {
		if (instance == null) {
			instance = new StudentRepository();
		}
		return instance;
	}

	@Override
	public Student getStudentById(UUID studentId) {
		return students.get(studentId);
	}

	@Override
	public void save(Student student) {
		if (student != null) {
			students.put(student.getId(), student);
		} else {
			throw new IllegalArgumentException(
					"Cannot add a null reference for this method!");
		}

	}

}
