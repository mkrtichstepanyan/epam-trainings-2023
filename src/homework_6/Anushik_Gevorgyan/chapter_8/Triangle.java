package homework_6.Anushik_Gevorgyan.chapter_8;

class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle. ");
        return dim1 * dim2;
    }
}
