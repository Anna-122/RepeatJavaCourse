package lesson6_1;

import java.util.Arrays;

public class BubbleSorter {
    public static void main(String[] args) {
        int[] mas = {11, 3, 14, 16, 7};

        boolean isSorted = false; // флажок того, отсортирован ли уже массив или нет.
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    //В цикле for проверяем, больше ли i-й элемент, чем элемент i+1.
                    // Если да, то устанавливаем флажек отсортированости в false (есть обмен, поэтому массив все еще не отсортирован)
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}
