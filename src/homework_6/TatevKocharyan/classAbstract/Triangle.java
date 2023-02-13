package homework_6.TatevKocharyan.classAbstract;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}