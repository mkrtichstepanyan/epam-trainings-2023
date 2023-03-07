package homework_6.Eduard_Eghiazaryan.Chapter_6;

abstract class FigureAbstract {
    double dim1;
    double dim2;

    FigureAbstract(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}