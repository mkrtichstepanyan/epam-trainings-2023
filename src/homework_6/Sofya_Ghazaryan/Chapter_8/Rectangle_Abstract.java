package homework_6.Sofya_Ghazaryan.Chapter_8;

public class Rectangle_Abstract extends Figure_Abstract {
    Rectangle_Abstract(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
