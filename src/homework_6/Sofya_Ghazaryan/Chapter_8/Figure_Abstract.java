package homework_6.Sofya_Ghazaryan.Chapter_8;

abstract class Figure_Abstract {
    double dim1;
    double dim2;

    Figure_Abstract(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}
