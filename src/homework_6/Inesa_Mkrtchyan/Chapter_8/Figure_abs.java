package homework_6.Inesa_Mkrtchyan.Chapter_8;

abstract class Figure_abs {
    double dim1;
    double dim2;
    Figure_abs(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
