package ddd.repository;

import ddd.domain.Teacher;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class TeacherRepository implements ITeacherRepository {

    private Map<UUID, Teacher> teachers;

    private TeacherRepository(){
        if (teachers == null) {
            teachers = new HashMap<UUID, Teacher>();
        }
    }
    @Override
    public Teacher getTeacherById(UUID teacherId) {
        return teachers.get(teacherId);
    }
}
