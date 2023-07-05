package coreJava14;

public class Thread1 extends Thread{
    public static void main(String[] args) {
        Thread1 thread = new Thread1();
        thread.start();
        System.out.println("Code outside the thread");

    }

    @Override
    public void run() {
        System.out.println("Code in a Thread");
    }
}
