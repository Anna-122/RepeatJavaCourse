/*С помощью класса Scanner ввести целое число. Если это число от 0 до 10, вывести на консоль сообщение “Положительное число меньше 10”,
иначе вывести сообщение “Положительное число больше 10 или отрицательное”.
 Используем оператор if-else. */
package lesson5;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ifElseMethod {

    public static void main( String[] args ) {
        isMinus1();
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

    public static void isMinus1() {

        String strNum = Integer.toString(intScan());
        String regex = ("-?\\d");
        Pattern p1 = Pattern.compile(regex);
        Matcher m1 = p1.matcher(strNum);
        if(m1.find()) {
            System.out.println("Число отрицательное" );
        }else{
            System.out.println("Число положительное");
        }

    }
}
