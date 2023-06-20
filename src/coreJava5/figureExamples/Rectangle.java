package coreJava5.figureExamples;

public class Rectangle extends Figure implements FigureInterface{
    Rectangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return dim1*dim2;
    }

    @Override
    public double area(double dim1, double dim2) {
        return dim1*dim2;
    }
}
