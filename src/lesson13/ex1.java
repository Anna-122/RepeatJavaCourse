package lesson13;

public class ex1 {
    public static void main( String[] args ) {
        double d = 0;
        String str = "13.98";
        try {
            d = Double.parseDouble(str);
            System.out.println(d);
        } catch (NumberFormatException l) {
            System.err.println("Неверный формат строки!");
        }


        double  i = 32.4;
        String str1 = Double.toString(i);
        System.out.println(str1);

        double d1 = 3.14;
        int i1 = (int) d1;
        System.out.println(i1);

    }
}
