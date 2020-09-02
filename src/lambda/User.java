package lambda;

public class User {
    String name, surname;

    User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    public static void main(String[] args) {
        UserFactory userFactory = User::new;
        User user = userFactory.create("John", "Snow");
    }
}
