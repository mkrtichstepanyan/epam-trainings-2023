package homework_6.Vladimir_Vanyan.Chapter_8.Method_Overriding;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }

}
