package coreJava5;

abstract class AbstractDemo{
    void hello(){
        System.out.println("Hello from Abstract class");
    }
}
class AbstractDemoSub extends AbstractDemo{
    void helloSub(){
        System.out.println("Hello from Abstract sub class ");
    }
}
public class AbstractDemoMain {
    public static void main(String[] args) {
        AbstractDemoSub abstractDemoSub = new AbstractDemoSub();
        abstractDemoSub.hello();
        abstractDemoSub.helloSub();
    }
}
