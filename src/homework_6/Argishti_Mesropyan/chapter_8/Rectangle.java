package homework_6.Argishti_Mesropyan.chapter_8;

public class Rectangle extends  Figure {
    Rectangle(double a, double b){
        super(a, b);
    }
    double area(){
        System.out.println("Inside Are for Rectangle.");
        return dim1 * dim2;
    }
}
