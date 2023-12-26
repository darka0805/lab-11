package second;

import lombok.Getter;
import lombok.Setter;

enum Gender {
    MALE, FEMALE
}

@Getter
@Setter
public class Client {
    private static int count = 0;

    private int id;
    private String name;
    private Gender sex;
    private int age;

    public Client(String name, Gender sex, int age) {
        id = ++count;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
