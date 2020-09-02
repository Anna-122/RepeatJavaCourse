package lambda.homework.supplier;

import java.util.function.Supplier;

//Написать лямбда выражение, которое возвращает случайное число
//        от 0 до 10. Используем функциональный интерфейс Supplier.
public class Supplier1 {

    public static void main( String[] args ) {

        Supplier<Double> supplierDouble = () -> Math.random()*3;
        System.out.println(supplierDouble.get());
    }
}
