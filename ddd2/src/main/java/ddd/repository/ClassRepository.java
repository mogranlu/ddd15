package ddd.repository;

import ddd.*;
import ddd.Class;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class ClassRepository implements IClassRepository {

    private Map<UUID, Class> classes;

    private ClassRepository() {
        if (classes == null) {
            classes = new HashMap<UUID, Class>();
        }
    }

    @Override
    public ddd.Class getClassById(UUID classId) {
        return classes.get(classId);
    }
}
