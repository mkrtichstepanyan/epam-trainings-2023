package homework_6.Varsik_Pijoyan.chapter_8.AbstractClasses;

public class TriangleAbstr extends FigureAbstr{
    TriangleAbstr(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
