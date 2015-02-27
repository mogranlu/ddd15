package ddd.repository;

import ddd.Teacher;

import java.util.UUID;

public interface ITeacherRepository {

    public Teacher getTeacherById(UUID teacherId);
}
