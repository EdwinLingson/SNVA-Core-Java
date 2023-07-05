package coreJava14;

public class NewThread implements Runnable{
    String name;
    Thread t;
    NewThread(String threadName){
        name = threadName;
        t = new Thread(this,name);
        System.out.println();
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int ctr = 15; ctr > 0; ctr--) {
                System.out.println(this.name+": " +ctr);
                Thread.sleep(3000);
            }
        } catch (InterruptedException e) {
            System.out.println("Exception Caught");
        }
        System.out.println(name+ " Exiting");
    }
}
