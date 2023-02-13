package homework_6.Nona_Asatryan.chapter8;

public class TriangleAbstract extends FigureAbstract {
    TriangleAbstract(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
