package homework_6.Roza_Petrosyan.chapter_8.AbstractAreas;

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for Triangle");
        return dim1 * dim2 / 2;
    }
}
