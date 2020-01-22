/*
Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while
 */


package lesson5;

public class WhileEx {
    public static void main( String[] args ) {
        int n = 11;
        while (n > 1) {
            System.out.println("Task " + --n);
        }
    }
}
