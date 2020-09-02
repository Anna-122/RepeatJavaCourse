package lambda.homework;

import java.util.function.Predicate;

public class Predicate_4 {
    public static void main( String[] args ) {


        Predicate<String> startsJ = t -> t.startsWith("J");
        Predicate<String> startsN = t -> t.startsWith("N");
        Predicate<String> finishA = t -> t.endsWith("A");
        System.out.println(startsJ . or( startsN).and(finishA).test("NBCDA"));
    }
}





       // строка начинается буквой “J”или “N” и заканчивается “A”

