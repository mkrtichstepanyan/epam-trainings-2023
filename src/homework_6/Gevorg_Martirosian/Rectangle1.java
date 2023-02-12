package homework_6.Gevorg_Martirosian;

public class Rectangle1 extends Figure1{
    public Rectangle1(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("inside area for Rectangle");
        return dim1 * dim2;
    }
}
