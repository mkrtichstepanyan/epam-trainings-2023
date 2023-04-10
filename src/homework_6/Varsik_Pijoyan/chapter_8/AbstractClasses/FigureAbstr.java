package homework_6.Varsik_Pijoyan.chapter_8.AbstractClasses;

abstract class FigureAbstr {
    double dim1;
    double dim2;

    FigureAbstr(double a, double b){
        dim1 = a;
        dim2 = b;
    }
    abstract double area();

}
