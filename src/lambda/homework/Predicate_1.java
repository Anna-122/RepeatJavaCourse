package lambda.homework;
import java.util.function.Predicate;

public class Predicate_1 {
    public static void main(String[] args) {


        String str2 = null;

        Predicate<String> isPositive = x -> x != str2;




        System.out.println(isPositive.test("")); // true
        System.out.println(isPositive.test(null)); // false

       // лямбда выражение, которое возвращает значение true, если строка не null
    }


}


