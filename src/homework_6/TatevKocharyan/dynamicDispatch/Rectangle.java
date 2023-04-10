package homework_6.TatevKocharyan.dynamicDispatch;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangel.");
        return dim1 * dim2;
    }
}