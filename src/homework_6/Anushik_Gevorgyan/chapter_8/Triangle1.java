package homework_6.Anushik_Gevorgyan.chapter_8;

class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Triangle. ");
        return dim1 * dim2;
    }
}
