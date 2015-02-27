package ddd;

import java.util.UUID;

public interface ITeacherRepository {

    public Teacher getTeacherById(UUID teacherId);
}
