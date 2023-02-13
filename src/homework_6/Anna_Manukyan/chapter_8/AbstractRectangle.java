package homework_6.Anna_Manukyan.chapter_8;

public class AbstractRectangle extends AbstractFigure {
    public AbstractRectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for rectangle");
        return dim1 * dim2;
    }
}
