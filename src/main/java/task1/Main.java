package task1;

public class Main {
    public static void main(String[] args) {
        User user = User
                .builder()
                .name("Darka")
                .gender(Gender.FEMALE)
                .occupation("Student")
                .build();

        System.out.println(user);
    }
}