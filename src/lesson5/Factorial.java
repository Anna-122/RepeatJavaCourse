package lesson5;

/*
Реализовать подсчет факториала используя цикл for.
Число n задается случайным образом (используйте Math.random()).
 */

import java.util.Scanner;

public class Factorial extends recursionFactor {
    public static void main( String[] args ) {
        System.out.println(factorial(Scan()));
    }

    public static double factorial( double n ) {
        double result = 1;
        for (int i = 1; i <=n; i ++){
            result = result*i;
        }
        return result;
    }
    static double Scan() {
        int i = 0;
        Scanner yourNumber = new Scanner(System.in);
        System.out.print("Введите любое число для подсчета факториала: ");
        if (yourNumber.hasNextInt()) {
            i = yourNumber.nextInt();
        }
        return i;
    }
}