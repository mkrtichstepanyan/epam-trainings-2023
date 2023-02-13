package homework_6.Gevorg_Martirosian;

public class Rectangle extends Figure{
    public Rectangle(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("inside area for Rectangle");
        return dim1 * dim2;
    }
}
