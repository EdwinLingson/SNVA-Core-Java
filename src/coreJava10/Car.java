package coreJava10;

public class Car implements Cloneable{
    String carmake;
    float maxSpeed;

    public Car(String carmake, float maxSpeed) {
        this.carmake = carmake;
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
