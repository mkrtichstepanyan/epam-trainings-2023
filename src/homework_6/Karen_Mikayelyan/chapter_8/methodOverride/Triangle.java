package homework_6.Karen_Mikayelyan.chapter_8.methodOverride;

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
