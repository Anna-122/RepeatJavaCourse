package lesson13;

public class WidenAndBox {
    static void go(Long x) {
        System.out.println("Long");
    }

    public static void main(String[] args) {
        byte b = 5;
         go((long) b);
        // нужно расширить до long и упаковать, что невозможно
    }

}
