package homework_6.rafik_pahlevanyan.chapter_8;

public class Triangle1 extends FigureAbstract {
    Triangle1(double a, double b) {
        super(a, b);
    }

    //override area for right triangle1
    double area() {
        System.out.println("Inside Area for Triangle1. ");
        return dim1 * dim2 / 2;
    }
}