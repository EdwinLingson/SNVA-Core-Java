package coreJava6;

class Car {
    String color;
    int top_speed;
    String type;
    boolean isConvertible;

    Car() {
        color = "White";
        top_speed = 0;
        isConvertible = false;
    }

    public Car(String color, int top_speed, String type, boolean isConvertible) {
        this.color = color;
        this.top_speed = top_speed;
        this.type = type;
        this.isConvertible = isConvertible;
    }
    void printColor(){
        System.out.println("My Car is "+color+" in color");
    }
    void isConvertible(){
        System.out.println("My car, is "+(isConvertible?"a convertible":"not a conveible"));
    }
    void print(){
        printColor();
        isConvertible();
    }
}
    class Ferrari extends Car {
        Ferrari(String color,String type,boolean isConvertible){
            this.color = color;
            this.type = type;
            top_speed = 130;
            this.isConvertible =isConvertible;
        }
        void printColor(){
            System.out.println("My Ferrari is "+color+" in color");
        }
        void topSpeed(){
            System.out.println("It Hits a maximum of "+ top_speed);
        }
        void whatType(){
            System.out.println("It is a "+type);
        }
        void isConvertible(){
            System.out.println("My car, ferrari is "+(isConvertible?"a convertible":"not a conveible"));
        }
        void setNewFeatures(int speed, String color){
            this.top_speed =speed;
            this.color = color;
            System.out.println("The Speed is set to " +speed + " and color is set to "+color);
        }
        void setNewFeatures(int speed){
            this.top_speed =speed;
            System.out.println("The Speed is set to " +speed);
        }

        void print() {
            super.print();
            whatType();
            topSpeed();
        }
    }

public class CarTask {
    public static void main(String[] args) {
        Ferrari ferrari = new Ferrari("Red","Coupe",true);
        ferrari.print();
        ferrari.setNewFeatures(200);
        ferrari.print();
        ferrari.setNewFeatures(150,"Blue");
        ferrari.print();
    }
}
