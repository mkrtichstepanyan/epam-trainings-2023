package homework_6.Varsik_Pijoyan.chapter_8.RunTimePolymorphism;

public class Triangle extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Inside Area for Triangle.");
        return dim1 * dim2 / 2;
    }
}
