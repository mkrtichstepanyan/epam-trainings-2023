package homework_6.Hovhannes_Gspeyan.chapter_8;

public class Rectangle2 extends Figure2{

    public Rectangle2(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("Inside area for rectangle ");
        return dim1 * dim2;
    }

}
