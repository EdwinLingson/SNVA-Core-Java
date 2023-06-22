package coreJava5;

public class StaticDemoMain {
    static {
        System.out.println("Main's Static");
    }
    public static void main(String[] args) {
        StaticDemo.displayNum1();
        StaticDemo staticDemo = new StaticDemo();
        staticDemo.sum();
        System.out.println("Num2 :"+StaticDemo.num2);
    }
}
