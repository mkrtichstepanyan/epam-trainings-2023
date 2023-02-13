package homework_6.Ani_Barseghyan.chapter_8.Figure;

public class Rectangle extends Figure {


    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for rectangle");
        return dim1 * dim2;
    }
}
