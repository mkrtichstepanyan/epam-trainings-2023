package homework_6.Robert_Nazaryan;

abstract class Figure1 {
    double dim1;
    double dim2;

    Figure1(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    //area is now an abstract method
    abstract double area();
}
