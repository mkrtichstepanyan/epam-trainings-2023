package homework_6.Vahe_Vardanyan.Chapter_8;

abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
class Rectangle1 extends Figure1{
    Rectangle1(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Area for Rectangle. ");
        return dim1 * dim2;
    }
}
class Triangle1 extends Figure1{
    Triangle1(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Area for Triangle. ");
        return  dim1 * dim2 / 2;
    }
}
class AbstractAreas{
    public static void main(String[] args) {
        Figure1 f = new Figure1(10, 10) {
            @java.lang.Override
            double area() {
                return 0;
            }
        };
        Rectangle1 r  = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);
        Figure1 figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}