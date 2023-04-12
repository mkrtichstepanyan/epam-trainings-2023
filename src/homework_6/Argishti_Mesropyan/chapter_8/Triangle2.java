package homework_6.Argishti_Mesropyan.chapter_8;

public class Triangle2 extends Figure2 {
    Triangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
