package homework_6.Radik_Manasyan.chapter8;

abstract class AbstractFigure {
    double dim1;
    double dim2;

    AbstractFigure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class RectangleF extends AbstractFigure {
    RectangleF(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области четырехугольника.");
        return dim1 * dim2;
    }
}

class TriangleF extends AbstractFigure {
    TriangleF(double a, double b) {
        super(a, b);
    }

    double area() {
        System.out.println("В области треугольника.");
        return dim1 * dim2 / 2;
    }
}
