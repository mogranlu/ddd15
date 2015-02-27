package ddd.repository;

import ddd.domain.Class;
import ddd.domain.IClassRepository;

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
    public Class getClassById(UUID classId) {
        return classes.get(classId);
    }
}
