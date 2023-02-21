package homework_6.Ofelya_Khachatryan.chapter_8;

public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
