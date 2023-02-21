package homework_6.rafik_pahlevanyan.chapter_8;

//Using run-time polymorphism.
public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    double area() {
        System.out.println("Area for Figure is undefined. ");
        return 0;
    }
}