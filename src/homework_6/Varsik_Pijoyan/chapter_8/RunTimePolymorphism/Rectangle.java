package homework_6.Varsik_Pijoyan.chapter_8.RunTimePolymorphism;

public class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a, b);
    }

    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
