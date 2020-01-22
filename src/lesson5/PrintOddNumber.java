/*Передать на вход программы число в качестве аргумента. Если оно нечетное, распечатать его.
Используем оператор if. Используйте метод Integer.parseInt() для преобразования из String в int.*/
package lesson5;

public class PrintOddNumber {
    public static void main( String[] args ) {

        int number = Integer.parseInt("47");
        if(number % 2 != 0)
            System.out.println("Урааа!!! Нечетное число ");
    }
}
