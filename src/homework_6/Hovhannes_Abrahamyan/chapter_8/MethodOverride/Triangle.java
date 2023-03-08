package homework_6.Hovhannes_Abrahamyan.chapter_8.MethodOverride;

public class Triangle extends Figure {
    public Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for Triangle");
        return dim1 * dim2 / 2;
    }
}
