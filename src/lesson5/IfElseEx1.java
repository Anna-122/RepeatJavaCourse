/*С помощью класса Scanner ввести целое число. Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”,
иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 Используем оператор if-else. */
package lesson5;
import java.util.Scanner;

public class IfElseEx1 {
    public static void main( String[] args ) {

        if(intScan()<10){
            System.out.println("Положительное число меньше 10");
        }
        else {
            System.out.println("ППоложительное число больше 10 или отрицательное");
        }

    }

    static int intScan() {
        int i = 0;
        Scanner yourNumber = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        if (yourNumber.hasNextInt()) {
            i = yourNumber.nextInt();
        }
        return i;
    }

}
