package ddd.repository;

import java.util.UUID;

public interface IClassRepository {

    public ddd.domain.Class getClassById(UUID classId);
}
