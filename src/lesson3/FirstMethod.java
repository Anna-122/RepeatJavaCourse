package lesson3;

public class FirstMethod {
    public static void main( String[] args ) {
       int m, d,g,h;
        h=mathExPlus(20,8);
        g=mathExMinus(90,7);
        d=mathExMult(56,9000);
        m=mathExDivision(899000,45);
        System.out.println(h);
        System.out.println(g);
        System.out.println(d);
        System.out.println(m);
    }
    public static int mathExPlus (int a, int b){
        return a+b;
    }
    public static int mathExMinus (int a, int b) {
        return a - b;
    }

    public static int mathExMult (int a, int b) {
        return a * b;
    }
    public static int mathExDivision (int a, int b) {
        return a / b;
    }
}
