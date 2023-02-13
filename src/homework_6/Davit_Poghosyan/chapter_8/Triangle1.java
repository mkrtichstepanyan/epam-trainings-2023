package homework_6.Davit_Poghosyan.chapter_8;

public class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
