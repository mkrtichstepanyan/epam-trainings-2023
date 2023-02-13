package chapter_8.Hovhannes_Abrahamyan.chapter_8.AbstractAreas;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract  double area();

}
