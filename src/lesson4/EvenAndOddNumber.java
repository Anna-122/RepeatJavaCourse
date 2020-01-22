/*Создать программу, которая будет сообщать, является ли целое число, введённое пользователем, чётным или нечётным.
Если пользователь введёт не целое число, то сообщать ему об ошибке.
 */
package lesson4;
import java.util.Scanner;
public class EvenAndOddNumber {
    public static void main( String[] args ) {
        Scanner yourNumber = new Scanner(System.in);
        System.out.println("Введите любое число ");

        if (yourNumber.hasNextInt()) {
            int number1 = yourNumber.nextInt();
            System.out.println(dividesByTwo(number1));
            System.out.println("Вы ввели четное число");

        } else {
            System.out.println("Вы ввели не четное число");
        }
    }
    static boolean dividesByTwo ( int a){
        return (a % 2 == 0);

    }
}