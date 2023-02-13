package homework_6.Ani_Barseghyan.chapter_8.AbstractFigure;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}
