/*
Распечатать все числа от 1 до 100,
которые делятся на 5 без остатка. Используем цикл do-while
 */

package lesson5;

public class DoWhileEx {
    public static void main( String[] args ) {
        int i = 5;
        do {
            System.out.println(i);
            i++;
        } while (i <= 100);
        System.out.println(i/5);

    }

}
