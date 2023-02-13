package homework_6.Shushanik_Araqelyan.chapter8;

public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println(" Inside Area for Triangle .");
        return dim1 * dim2 / 2;
    }
}
