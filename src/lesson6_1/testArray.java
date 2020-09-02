package lesson6_1;

import java.util.Arrays;

public class testArray {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int pos1 = Arrays.binarySearch(array1, 20);
        int pos2 = Arrays.binarySearch(array1, 40);
        System.out.println(pos1);
        System.out.println(pos2);
    }
}