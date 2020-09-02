//Написать лямбда выражение, которое принимает на вход число и возвращает значение
//        “Положительное число”, “Отрицательное число” или  “Ноль”.
//        Используем функциональный интерфейс Function


package lambda.homework.function;

import java.util.function.Function;

public class Function1 {
    public static void main( String[] args ) {
        Function<Integer,Integer> f1 = s -> s = 1;
        Function<Integer,Integer> f2 = s -> s = 1;
        Function<Integer,Integer> f3 = s -> s = 1;



        System.out.println(f1.andThen(f2).compose(f3).apply(6));

    }
}

