package threads;

public class MyRunnable {
    public static void main(String[] args) throws InterruptedException {
        MyRunnable myRunnable = new MyRunnable();

        Thread thread = new Thread(String.valueOf(myRunnable));
        System.out.println("Before starting: " + thread.isAlive());
        thread.start();
        System.out.println("After starting: " + thread.isAlive());
        thread.join();
        System.out.println("After thread completed: " + thread.isAlive());
    }
}