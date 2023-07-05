package coreJava14;

public class Thread2 implements Runnable{
    public static void main(String[] args) {
        Thread2 obj = new Thread2();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("Outside the thread");
    }

    @Override
    public void run() {
        System.out.println("Inside the thread");
    }
}
