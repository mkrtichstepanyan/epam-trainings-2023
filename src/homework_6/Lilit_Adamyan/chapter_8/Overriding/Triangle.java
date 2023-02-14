package homework_6.Lilit_Adamyan.chapter_8.Overriding;

public class Triangle extends Figure {

    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Triangle");
        return dim1 * dim2 / 2;
    }
}
