package homework_6.Lilit_Adamyan.chapter_8.Overriding;

public class Figure {
    double dim1;
    double dim2;

    Figure(double a, double b) {
        dim1 = a;
        dim2 = b;
    }
    double area(){
        System.out.println("Area doe Figure undefined");
        return 0;
    }
}
