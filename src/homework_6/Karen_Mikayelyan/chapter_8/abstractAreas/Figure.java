package homework_6.Karen_Mikayelyan.chapter_8.abstractAreas;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();

}
