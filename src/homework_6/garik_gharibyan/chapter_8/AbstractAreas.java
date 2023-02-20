package homework_6.garik_gharibyan.chapter_8;

abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class Rectangle1 extends Figure1 {

    Rectangle1(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Rectangle1.");
        return dim2 * dim1;
    }
}

class Triangle1 extends Figure1 {
    Triangle1(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Triangle1.");
        return dim1 * dim2 / 2;
    }
}

public class AbstractAreas {
    public static void main(String[] args) {

//        Figure1 f = new Figure1(10,10);   illegal

        Rectangle1 r = new Rectangle1(9,5);
        Triangle1 t = new Triangle1(10,8);
        Figure1 figure1;

        figure1 = r;
        System.out.println("Area is " + r.area());

        figure1= t;
        System.out.println("Area is " + t.area());


    }
}
