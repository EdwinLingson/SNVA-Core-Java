package coreJava3;

class TaskFunction1 {
    int a,b,c;
    TaskFunction1(){
        a=2;
        b=3;
        c=5;
    }
    int adder(){
        return a+b+c;
    }
    void multipy(){
        System.out.println("Product: "+a*b*c);
    }
}
public class TaskFunction1Driver {
    public static void main(String[] args) {
        TaskFunction1 taskFunction1 = new TaskFunction1();
        System.out.println("Sum is: "+taskFunction1.adder());
        taskFunction1.multipy();
    }
}