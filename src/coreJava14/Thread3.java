package coreJava14;

public class Thread3 extends Thread{
static int ctr =0;
    public static void main(String[] args) {

       Thread3 thread3 = new Thread3();
       thread3.start();
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
