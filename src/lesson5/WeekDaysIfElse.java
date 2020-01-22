/*
Передать на вход программы число От 1 до 7 в качестве аргумента. Если число равно 1,
 выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
  Если 6 или 7 – “Выходной”. Используем конструкцию if-else-if.
 */
package lesson5;

import java.util.Scanner;

public class WeekDaysIfElse {
    public static void main( String[] args ) {
       int day = dayScan();
        String defineDay;
        if (day== 1) {
            defineDay = "Monday";
        } else if (day== 2 ) {
            defineDay = "Tuesday";
        } else if (day== 3) {
            defineDay = "Wednesday";
        } else if (day == 4) {
            defineDay= "Thursday";
        } else if (day == 5) {
            defineDay= "Friday";
        } else if (day== 6) {
            defineDay= "Saturday";
        } else if (day == 7) {
            defineDay= "Sunday";

        } else {
            defineDay= "Not a Day";
        }
        System.out.println("Your chosen day is " + defineDay + ".");
    }



    static int dayScan() {
        int i = 0;
        Scanner yourDay = new Scanner(System.in);
        System.out.print("Введите любое число для выбора дня");
        if (yourDay.hasNextInt()) {
            i = yourDay.nextInt();
        }
        return i;
    }
}

