package coreJava14;

public class MeasurableClass {
    public static void main(String[] args) {
        int m =100;
        Measurable ms = ()->{
            System.out.println("Measuring "+m);
        };
        ms.measeure();
    }
}
