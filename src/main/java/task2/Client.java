package task2;

import lombok.Getter;
import lombok.Setter;

enum Gender {
    MALE, FEMALE
}
@Getter @Setter
public class Client {
    private int id;
    private String name;
    private Gender sex;
    private int age;
    private static int count = 0;

    public Client(String name, Gender sex, int age) {
        id = ++count;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}