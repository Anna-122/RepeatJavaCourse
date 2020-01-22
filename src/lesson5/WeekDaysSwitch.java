/*
Передать на вход программы число От 1 до 7 в качестве аргумента. Если число равно 1,
 выводим на консоль “Понедельник”, 2 –”Вторник” и так далее.
  Если 6 или 7 – “Выходной”. Используем конструкцию switch.
 */


package lesson5;

import java.util.Scanner;

public class WeekDaysSwitch {
    public static void main( String[] args ) {
        int day = dayScan();
        switch (day) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
            break;
            case 3:
                System.out.println("Среда");
            break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
                System.out.println("Суббота");
                break;
            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                System.out.println("Такого дня не существует");
                break;
        }

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

