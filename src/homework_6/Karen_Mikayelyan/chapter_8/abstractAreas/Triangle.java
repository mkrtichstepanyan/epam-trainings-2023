package homework_6.Karen_Mikayelyan.chapter_8.abstractAreas;

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
