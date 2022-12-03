package task1;

import lombok.Getter;
import lombok.Setter;

public class User {
    private int id;
    @Getter
    private String name;
    @Getter
    private String email;
    @Getter
    private int age;
    @Setter
    private DataBase db = DataBase.getInstance();

    public User(String name, String email, Integer age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public void save() {
        db.insertUser(this);
    }
}
