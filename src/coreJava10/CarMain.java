package coreJava10;

public class CarMain {
    public static void main(String[] args) {
        Car car1= new Car("Aston Martin",160.23f);
        try {
            Car car2 = (Car) car1.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
