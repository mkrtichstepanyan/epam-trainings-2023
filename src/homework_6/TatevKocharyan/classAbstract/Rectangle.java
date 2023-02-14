package homework_6.TatevKocharyan.classAbstract;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("inside Area for rectangle.");
        return dim1 * dim2;
    }
}