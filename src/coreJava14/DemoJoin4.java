package coreJava14;

public class DemoJoin4 {
    public static void main(String[] args) {
        NewThread T1 = new NewThread("Thread 1");
        NewThread T2 = new NewThread("Thread 2");
        NewThread T3 = new NewThread("Thread 3");
        System.out.println("Thread 1 is alive "+ T1.t.isAlive());
        System.out.println("Thread 2 is alive "+ T2.t.isAlive());
        System.out.println("Thread 3 is alive "+ T3.t.isAlive());
        System.out.println("Waiting for Threads to finish");
        try {
            T1.t.join();
            T2.t.join();
            T3.t.join();
        } catch (InterruptedException e) {
            System.out.println("Exception Caught: Main Interrupted");

        }
        System.out.println("Thread 1 is alive "+ T1.t.isAlive());
        System.out.println("Thread 2 is alive "+ T2.t.isAlive());
        System.out.println("Thread 3 is alive "+ T3.t.isAlive());
    }
}
