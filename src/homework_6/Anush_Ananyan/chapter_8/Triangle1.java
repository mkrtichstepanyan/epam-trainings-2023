package homework_6.Anush_Ananyan.chapter_8;

public class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle");
        return dim1 * dim2 / 2;
    }
}
