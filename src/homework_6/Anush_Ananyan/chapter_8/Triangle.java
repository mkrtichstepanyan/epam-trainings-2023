package homework_6.Anush_Ananyan.chapter_8;

import java.sql.SQLOutput;

public class Triangle extends Figure {
    Triangle(double a, double b) {
        super(a, b);
    }

    @java.lang.Override
    double area() {
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
