package homework_6.TatevKocharyan.dynamicDispatch;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Iside Area for triangel.");
        return dim1 * dim2 / 2;
    }
}