package homework_6.Anushik_Gevorgyan.chapter_8;

class Rectangle1 extends Figure1 {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle1. ");
        return dim1 * dim2;
    }
}
