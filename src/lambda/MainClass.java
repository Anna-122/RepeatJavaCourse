package lambda;

import java.util.function.Function;

public class MainClass {
    public static void main(String[] args) {
        Function<String, Integer> toInteger = string -> parse(string);
        Integer integer = toInteger.apply("5");
    }

    private static Integer parse(String s) {
        return Integer.parseInt(s);

    }
}
