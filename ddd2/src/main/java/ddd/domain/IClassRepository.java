package ddd.domain;

import java.util.UUID;

public interface IClassRepository {

    public ddd.domain.Class getClassById(UUID classId);
}
