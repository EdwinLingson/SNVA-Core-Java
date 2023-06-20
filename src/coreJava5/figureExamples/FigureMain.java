package coreJava5.figureExamples;

public class FigureMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        Triangle triangle = new Triangle(10,20);
        Figure figure;
        figure = rectangle;
        System.out.println("Area of Rectangle with Abstract class: "+figure.area());
        System.out.println("Area of Rectangle with interfaces: "+rectangle.area(10,30));
        figure =triangle;
        System.out.println("Area of Traingle with Abstract classes: "+figure.area());
        System.out.println("Area of Triangle with Interfaces: "+triangle.area(10,30));
    }
}
