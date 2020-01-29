package lesson5;

public class recursionFactor {
    public static void main( String[] args ) {
        int a = (int) (Math.random() * 100);
        System.out.println(factorial(a) + "!");
    }


    private static double factorial( double n ) {

        int result = 1;

        if (n == 0) {
            System.out.print(" = ");
            return result;
        }
        if (n == 1) {
            System.out.print(" * 1 = ");
            return result;
        }

        System.out.print(n);
        if (n != 2) {
            System.out.print(" * ");
        }

        result = (int) (n * factorial(n - 1));
        return result;
    }


}
