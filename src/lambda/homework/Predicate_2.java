package lambda.homework;

import java.util.function.Predicate;

public class Predicate_2 {
    public static void main( String[] args ) {

        String str2 = "";

        Predicate<String> isPositive = x -> x != str2;




        System.out.println(isPositive.test("ooo")); // true
        System.out.println(isPositive.test("")); // false

      //  лямбда выражение, которое проверяет, что строка не пуста

    }
}
