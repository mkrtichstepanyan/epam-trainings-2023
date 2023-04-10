package homework_6.Shushanik_Araqelyan.chapter8;

public class Rectangle extends Figure {
    Rectangle (double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println(" Inside Area for Rectangle. ");
        return dim1 * dim2;
    }
}
