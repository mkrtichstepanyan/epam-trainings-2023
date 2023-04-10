package homework_6.Armen_Martirosyan.Chapter_8;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Imside area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
