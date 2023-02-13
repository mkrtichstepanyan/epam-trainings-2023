package homework_6.gohar_hakobyan.chapter_8;

public class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }

}

