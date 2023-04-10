package homework_6.Nelli_Poghosyan.chapter_8;

public class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Rectangle. ");
        return dim1 * dim2;
    }
}
