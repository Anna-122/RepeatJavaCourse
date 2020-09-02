//Написать лямбда выражение, которое принимает на вход объект типа HeavyBox
// и выводит на консоль сообщение “Отгрузили ящик с весом n”.
//“Отправляем ящик с весом n” Используем функциональный интерфейс Consumer и метод по умолчанию andThen
package lambda.homework;

import java.util.concurrent.Callable;
import java.util.function.Consumer;

public class HeavyBox {
    public static void main( String[] args ) {

        final Callable<Double> doubleCallable = () -> {
            double pi = 3.1415;
            return pi;
        };


    }

}
