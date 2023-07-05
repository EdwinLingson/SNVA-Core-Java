package coreJava14;

public class NewThreadDriver {
    public static void main(String[] args) {
        new NewThread("Thread 1");
        new NewThread("Thread 2");
        new NewThread("Thread 3");
        try {
            Thread.sleep(30000);
        } catch (InterruptedException e) {
            System.out.println("Main Thread Interrupted");
        }
        System.out.println("Main Exiting");
    }
}
