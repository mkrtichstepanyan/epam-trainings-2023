package homework_6.Lilit_Adamyan.chapter_8.Abstract;

public abstract class Figure {
    double dim1;
    double dim2;

    Figure(double a,double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();
}
