package homework_6.Anushik_Gevorgyan.chapter_8;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle. ");
        return dim1 * dim2;
    }
}
