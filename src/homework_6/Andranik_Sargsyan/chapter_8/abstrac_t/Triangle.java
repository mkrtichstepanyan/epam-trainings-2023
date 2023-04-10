package homework_6.Andranik_Sargsyan.chapter_8.abstrac_t;

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for triangle");
        return dim1 * dim2 / 2;
    }
}
