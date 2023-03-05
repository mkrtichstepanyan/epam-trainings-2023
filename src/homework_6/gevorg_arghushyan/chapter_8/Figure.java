package homework_6.gevorg_arghushyan.chapter_8;

public abstract class Figure {
    double dim1;
    double dim2;
    Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }

    @Override
    double area() {
        System.out.println("Inside Rectangle method area()");
        return dim1 * dim2;
    }
}
class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Triangle method area()");
        return dim1 * dim2 / 2;
    }
}
class AbstractArea{
    public static void main(String[] args) {
        //Figure f = new Figure(10, 20);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10,8);
        Figure figuref;
        figuref = r;
        System.out.println("Area is equal to " + figuref.area());
        figuref = t;
        System.out.println("Area is equal to " + figuref.area());
    }
}
