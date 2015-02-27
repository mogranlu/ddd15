package ddd.application;

import java.util.UUID;

import ddd.domain.IStudentRepository;
import ddd.domain.Student;
import ddd.dto.StudentDTO;

public class GetStudentInformationApplicationService {
	private IStudentRepository studRepo;

	public GetStudentInformationApplicationService(IStudentRepository studRepo) {
		this.studRepo = studRepo;
	}

	public StudentDTO getStudentInformation(UUID studentID) {
		Student student = studRepo.getStudentById(studentID);
		// map
		StudentDTO mappedInfo = new StudentDTO( //
				student.getId() //
				, student.getName() //
				, student.getBirthDay() //
				, student.getGender() //
		);
		return mappedInfo;
	}
}
