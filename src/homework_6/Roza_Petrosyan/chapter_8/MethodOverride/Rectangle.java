package homework_6.Roza_Petrosyan.chapter_8.MethodOverride;

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
