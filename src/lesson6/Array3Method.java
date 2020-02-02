/*
Создать массив типа String размером 3х6. И записать в него значения:
a1  a2  a3  a4  a5  a6
b1  b2  b3  b4  b5  b6
c1  c2   c3  c4  c5  c6
И распечатать.
 */
package lesson6;

public class Array3Method {
    public static void main( String[] args ) {
        System.out.println("Создаю массив и заполняю его значениями");
        String[][] arr= createArray(3,6);
        System.out.println("Вывожу значения массива");
        arrayPrint(arr);
    }

    public static String[][] createArray( int f, int d ) {
        String[][] twoD = new String[f][d];
        int i, j, startOfCharCode = 97;
        char ch;
        String h1, h2, data = null;

        for (i = 0; i < 3; i++) {
            for (j = 0; j < 6; j++) {
                ch = (char) (startOfCharCode + i);
                h1 = String.valueOf(ch);
                h2 = String.valueOf(j + 1);
                data = h1 + h2;
                twoD[i][j]=data;
            }
        }
            return twoD;
    }


        public static void arrayPrint( String[][] two2D ) {

            for (int i = 0; i < two2D.length; i++) {
                for (int j = 0; j < two2D[0].length; j++) {
                    System.out.print(" " + two2D[i][j] + " ");
                }
                System.out.println("");
            }
        }
}