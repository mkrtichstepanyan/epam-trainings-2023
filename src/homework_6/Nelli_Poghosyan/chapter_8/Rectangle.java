package homework_6.Nelli_Poghosyan.chapter_8;

public class Rectangle extends Figure{
    Rectangle(double a , double b){
        super(a , b);
    }
    double area(){
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}
