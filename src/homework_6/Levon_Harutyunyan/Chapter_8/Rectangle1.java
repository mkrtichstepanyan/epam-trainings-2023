package homework_6.Levon_Harutyunyan.Chapter_8;

class Rectangle1 extends FigureAbstract {
    Rectangle1(double a, double b) {
        super(a, b);
    }

    //override area for rectangle1
    double area() {
        System.out.println("Inside Area for Rectangle1. ");
        return dim1 * dim2;
    }
}
