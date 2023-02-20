package homework_6.Alina_Mkhoyan.chapter_8;

public class Triangle1 extends FigureAbstract {
    Triangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle1. ");
        return dim1 * dim2 / 2;
    }
}