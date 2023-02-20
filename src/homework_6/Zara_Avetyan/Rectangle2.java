package homework_6.Zara_Avetyan;

public class Rectangle2 extends Figure2 {
    Rectangle2(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
