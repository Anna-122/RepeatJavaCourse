/* Создать программу, которая будет выводить на экран меньшее по модулю из трёх введённых пользователем вещественных чисел.
 Для вычисления модуля используйте тернарную условную операцию.*/

package lesson4;
import java.util.Scanner;
public class TernaryOperation {
    public static void main( String[] args ) {

        Scanner yourNum = new Scanner(System.in);
        System.out.println("Введите 3 любых вещественных числа: ");

        if (yourNum.hasNextDouble()) {
             double num1 = yourNum.nextDouble();
             double num2 = yourNum.nextDouble();
             double num3 = yourNum.nextDouble();
            System.out.println( num1<num2? num2<num3 : num1<num3);
            System.out.println(num1);

            //«Если p, то q, иначе r»,


         //   k = i < 0 ? -i : i;

        // boolean k=yourNum==hasNextDouble()
        } else {
            System.out.println("Вы ввели не правильно числа");
        }

    }
}
