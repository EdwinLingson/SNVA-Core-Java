package coreJava5.figureExamples;

public class Triangle extends Figure implements FigureInterface{

    Triangle(double dim1, double dim2) {
        super(dim1, dim2);
    }

    @Override
    double area() {
        return 0.5*dim1*dim2;
    }

    @Override
    public double area(double dim1, double dim2) {
        return 0.5* dim1*dim2;
    }
}
