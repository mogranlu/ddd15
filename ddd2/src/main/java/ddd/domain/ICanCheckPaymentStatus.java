package ddd.domain;

import java.util.UUID;

public interface ICanCheckPaymentStatus {
	public boolean hasStudentPaid(UUID studentId);
}
