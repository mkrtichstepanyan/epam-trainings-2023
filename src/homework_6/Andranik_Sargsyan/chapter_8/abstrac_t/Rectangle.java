package homework_6.Andranik_Sargsyan.chapter_8.abstrac_t;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for Rectangle");
        return dim1 * dim2;
    }
}
