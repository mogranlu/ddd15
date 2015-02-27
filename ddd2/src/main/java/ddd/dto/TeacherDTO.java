package ddd.dto;


import java.util.UUID;

public class TeacherDTO {

    private final UUID id;
    private final String name;
    private final String birthday;
    private final String gender;

    public TeacherDTO(UUID id, String name, String birthday, String gender){
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

}
