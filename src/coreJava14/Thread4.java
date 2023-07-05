package coreJava14;

public class Thread4 extends Thread{
    static int ctr =0;
    public static void main(String[] args) {

        Thread4 thread4 = new Thread4();
        thread4.start();
        while (thread4.isAlive()){
            System.out.println("Waitng...");
        }
        System.out.println("Main:Counter is: "+ctr);
        ctr++;
        System.out.println("Main:Counter is: "+ctr);

    }

    @Override
    public void run() {
        ctr++;
        System.out.println("Thread: Counter is "+ ctr);
    }
}
