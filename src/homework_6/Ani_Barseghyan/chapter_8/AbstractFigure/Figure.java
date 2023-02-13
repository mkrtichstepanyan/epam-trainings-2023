package homework_6.Ani_Barseghyan.chapter_8.AbstractFigure;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
