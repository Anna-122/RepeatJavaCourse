package lesson4;

import java.util.Scanner;

public class EvenAndOddNumber2 {
    public static void main( String[] args ) {

            if(dividesByTwo(intScan())){
            System.out.println("Вы ввели не четное число");

            } else {
            System.out.println("Вы ввели четное число");
        }
    }


    static boolean dividesByTwo ( int a){
        return (a % 2 == 0);

    }
    static int intScan() {
        int i = 0;
        Scanner yourNumber = new Scanner(System.in);
        System.out.print("Введите число: ");
        if (yourNumber.hasNextInt()) {
            i = yourNumber.nextInt();
        }
        return i;
    }

}
