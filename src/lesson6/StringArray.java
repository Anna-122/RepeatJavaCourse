/*
Создать массив типа String с размером 7. Записать в него значения дней недели.
 Вывести на консоль значение последнего элемента.
 */

package lesson6;

public class StringArray {
    public static void main( String[] args ) {
        String weekDays[]=new String[7];
        weekDays[0] = "Понедельник";
        weekDays[1] = "Вторник";
        weekDays[2] = "Среда";
        weekDays[3] = "Четверг";
        weekDays[4] = "Пятница";
        weekDays[5] = "Суббота";
        weekDays[6] = "Воскресенье";
        System.out.println("Last week`s day is "+ weekDays[6]);

    }
}
