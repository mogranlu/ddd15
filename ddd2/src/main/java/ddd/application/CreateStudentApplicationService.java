package ddd.application;

import ddd.domain.IStudentRepository;
import ddd.domain.Student;

public class CreateStudentApplicationService {
	
	private IStudentRepository studRepo;
	
	public CreateStudentApplicationService(IStudentRepository studRepo) {
		this.studRepo = studRepo;
	}
	
	public void Create(String name) {
		Student student = new Student();
		studRepo.save(student);
	}
}