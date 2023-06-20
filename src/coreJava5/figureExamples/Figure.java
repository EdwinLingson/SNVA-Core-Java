package coreJava5.figureExamples;

public abstract class Figure {
    double dim1,dim2;
    Figure(double dim1,double dim2){
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
    abstract double area();
}
