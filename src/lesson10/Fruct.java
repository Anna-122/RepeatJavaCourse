/*
Фруктовая лавка. Создать абстрактный класс Фрукт и классы Яблоко, Груша, Абрикос расширяющие его. Класс Фрукт содержит:
a) переменную вес,
б) завершенный метод printManufacturerInfo(){System.out.print("Made in Ukraine");}
в) абстрактный метод, возвращающий стоимость фрукта, который должен быть переопределен в каждом классе наследнике. Метод должен учитывать вес фрукта.
Создать несколько объектов разных классов. Подсчитать общую стоимость проданных фруктов. А также общую стоимость отдельно проданных яблок, груш и абрикос.
 */


package lesson10;

import java.util.Scanner;

public abstract class  Fruct {
    public static void main( String[] args ) {
        double weight, price;
        scan();
    }

    public Fruct( double price, double weight ) {
       price=price;
       weight=weight;
    }

    public  void  printManufacturerInfo(){
        System.out.print("Made in Ukraine");
    }


    public  abstract void Costcalculation(double price,double  weight);

    static double scan() {
        double i = 0;
        Scanner weight = new Scanner(System.in);
        System.out.print("Введите вес фруктов ");
        if (weight.hasNextDouble()) {
            i = weight.nextDouble();
        }
        return i;
    }
}
