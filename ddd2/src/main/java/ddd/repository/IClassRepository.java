package ddd.repository;

import ddd.*;

import java.util.UUID;

public interface IClassRepository {

    public ddd.Class getClassById(UUID classId);
}
