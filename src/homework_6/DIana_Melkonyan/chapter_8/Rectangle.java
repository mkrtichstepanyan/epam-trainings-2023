package homework_6.DIana_Melkonyan.chapter_8;

public class Rectangle extends Figure{
    Rectangle(double a, double b){
        super(a,b);
    }

    //overrid area for rectangle
    double area(){
        System.out.println("Inside Area for Rectangle.");
        return dim1 * dim2;
    }
}
