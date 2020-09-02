package lesson13;

public class Main {
//    public static void main(String[] args) {
//
//        String s1 = "JavaRush - лучший сайт для изучения Java!";
//        String s2 = "JavaRush - лучший сайт для изучения Java!";
//        String s3 = new String("JavaRush - лучший сайт для изучения Java!");
//        System.out.println(s1.equals(s3));
//    }
    public static void main(String[] args) {

        String s1 = "JavaRush - лучший сайт для изучения Java!";
        String s2 = new String("JavaRush - лучший сайт для изучения Java!");
        System.out.println(s1 == s2.intern());
    }

}

