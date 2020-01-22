package lesson3;
import java.util.Scanner;

public class SumOfNumbers {
    public static void main( String[] args ) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите 2 любых целых числа: ");


        if (scan.hasNextInt()) {
            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            System.out.println(number1 + number2);
        } else {
            System.out.println("Вы ввели не целое число");
        }

    }
}
