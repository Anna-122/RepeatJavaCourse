package lesson9;

public class MainPerson {
    public static void main( String[] args ) {
        Person person1 = new Person();
        Person person2 = new Person(18,"Anna");

        person1.PersonMove();
        person1.PersonMove();
        person2.PersonTalk();
        person2.PersonTalk();
    }
}
