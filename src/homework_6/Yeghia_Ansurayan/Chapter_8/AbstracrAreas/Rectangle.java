package homework_6.Yeghia_Ansurayan.Chapter_8.AbstracrAreas;

class Rectangle extends Figure {
    Rectangle(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
