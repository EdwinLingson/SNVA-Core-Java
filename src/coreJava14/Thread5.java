package coreJava14;

public class Thread5 {
    public static void main(String[] args) {
        Thread t = Thread.currentThread();
        System.out.println("Current Thread: "+t);
        t.setName("New Name Main");
        System.out.println("After Name Change\nThread: "+t);
        try {
            for (int ctr = 15; ctr > 0; ctr--) {
                System.out.println(ctr);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Mian Thread Broke");
        }
    }
}
