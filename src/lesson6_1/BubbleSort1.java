package lesson6_1;

import java.util.Arrays;

public class BubbleSort1 {
    public static void main( String[] args ) {
        int array[] = new int[]{10, 78, 3,5};

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j - 1] > array[j]) {
                    int tmp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = tmp;
                }
            }

        }
        System.out.println(Arrays.toString(array));
    }

}