package homework_6.Andranik_Sargsyan.chapter_8.abstrac_t;

abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

