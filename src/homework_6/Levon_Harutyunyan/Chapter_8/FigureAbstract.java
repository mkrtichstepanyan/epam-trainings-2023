package homework_6.Levon_Harutyunyan.Chapter_8;

abstract class FigureAbstract {
    double dim1;
    double dim2;

    FigureAbstract(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
