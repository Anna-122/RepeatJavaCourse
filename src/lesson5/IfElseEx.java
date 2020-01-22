/*С помощью класса Scanner ввести целое число. Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”,
иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 Используем оператор if-else. */
/*package lesson5;
import java.util.Scanner;

public class IfElseEx {
    public static void main( String[] args ) {
      if (intScan() >= 10 && isMinus1()) {
                        System.out.println("Положительное число больше 10 или отрицательное");
        } else {

                  System.out.println("Положительное число меньше или равно 10");
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

    public static int isMinus1() {
          int strNum=intScan();
        return strNum.matches("-?\\d");
    }

  /*  static boolean isMinus2() {
        if (intScan() < 0 ) {
               System.out.println("Положительное число больше 10 или отрицательное");

        }

        return true;
    }
} */