package homework_6.rafik_pahlevanyan.chapter_8;

//Using abstract methods and classes
abstract class FigureAbstract {
    double dim1;
    double dim2;

    FigureAbstract(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    //area is now an abstract method
    abstract double area();
}