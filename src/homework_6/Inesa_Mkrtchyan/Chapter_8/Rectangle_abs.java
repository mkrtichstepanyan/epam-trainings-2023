package homework_6.Inesa_Mkrtchyan.Chapter_8;

class Rectangle_abs extends Figure_abs{
    Rectangle_abs(double a, double b) {
        super(a, b);
    }
    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
