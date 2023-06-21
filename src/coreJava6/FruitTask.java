package coreJava6;

class Fruit{
    String color;
    double avg_weight;
    Fruit(){
    }
    void color(){
        System.out.println("The color is "+color);
    }
    void avgWeigt(){
        System.out.println("The AVG Weight is: "+avg_weight);
    }

}
class Mango extends Fruit {
    Mango(){
        color = "Yellow";
        avg_weight = 100;
    }
    void color(){
        System.out.println("The color of Mango  is "+color);
    }
    void avgWeigt(){
        System.out.println("The AVG Weight of Mango is: "+avg_weight);
    }
}
class Apple extends Fruit {
    Apple(){
        color = "Red";
        avg_weight =80;
    }
    void color(){
        System.out.println("The color of Apple  is "+color);
    }
    void avgWeigt(){
        System.out.println("The AVG Weight of Apple is: "+avg_weight);
    }
}
public class FruitTask {
    public static void main(String[] args) {
        Fruit mango = new Mango();
        Fruit apple = new Apple();
        mango.color();
        mango.avgWeigt();
        apple.color();
        apple.avgWeigt();
    }
}
