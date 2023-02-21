package homework_6.Hovhannes_Gspeyan.chapter_8;

public class Rectangle extends Figure{

    public Rectangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("Inside area for rectangle ");
        return dim1 * dim2;
    }

}
