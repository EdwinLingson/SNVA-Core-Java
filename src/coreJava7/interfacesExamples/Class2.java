package coreJava7.interfacesExamples;

public class Class2 implements Third{

    @Override
    public void first() {
        System.out.println("This is from First Interface");
    }

    @Override
    public void second() {
        System.out.println("This is from second Interface");
    }

    @Override
    public void third() {
        System.out.println("This is from third Interface");
    }
}
