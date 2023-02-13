package homework_6.Yeghia_Ansurayan.Chapter_8.AbstracrAreas;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
