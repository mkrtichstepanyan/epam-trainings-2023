package homework_6.Araksya_Ghazaryan.chapter_8;

public class Triangle  extends Figure{
    Triangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Area for Triangle.");
        return  dim1 * dim2 / 2;
    }
}