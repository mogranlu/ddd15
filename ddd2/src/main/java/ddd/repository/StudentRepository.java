package ddd.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import ddd.IStudentRepository;
import ddd.Student;

public class StudentRepository implements IStudentRepository {

	private static StudentRepository instance = null;
    private Map<UUID, Boolean> paymentDB;

	private StudentRepository() {
		if (paymentDB == null) {
			paymentDB = new HashMap<UUID, Boolean>();
		}
	}

	@Override
	public boolean hasStudentPaid(UUID studentId) {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		return null;
	}


}
