package homework_6.Hovhannes_Gspeyan.chapter_8;

public class Triangle extends Figure{

    public Triangle(double a, double b) {
        super(a, b);
    }
    double area(){
        System.out.println("Inside area for triangle ");
        return dim1 * dim2 / 2;
    }

}
