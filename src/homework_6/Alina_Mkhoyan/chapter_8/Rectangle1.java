package homework_6.Alina_Mkhoyan.chapter_8;

class Rectangle1 extends FigureAbstract {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle1. ");
        return dim1 * dim2;
    }
}