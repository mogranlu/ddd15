package ddd;

import java.util.UUID;

public interface IStudentRepository {
	public boolean hasStudentPaid(UUID studentId);
	public void makePayment(UUID studentId);
}
