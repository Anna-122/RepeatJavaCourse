package lambda.homework;

import java.util.function.Predicate;

public class Predicate3 {
    public static void main( String[] args ) {

        String str1="";
        String str2 =null;

        Predicate<String> isPositive1 = i -> i != str1 ;
        Predicate<String> isPositive2 = i -> i != str2 ;

        System.out.println(isPositive1.and(isPositive2).test("ggggg"));
        System.out.println(isPositive1.and(isPositive2).test(""));
        System.out.println(isPositive1.and(isPositive2).test(null));



// строка не null и не пуста


    }

}
