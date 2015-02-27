package ddd.repository;

import ddd.domain.Teacher;

import java.util.UUID;

public interface ITeacherRepository {

    public Teacher getTeacherById(UUID teacherId);
}
