package homework_6.Lilit_Adamyan.chapter_8.Abstract;

public class Rectangle extends Figure{
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}
