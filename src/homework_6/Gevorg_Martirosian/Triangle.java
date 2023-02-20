package homework_6.Gevorg_Martirosian;

public class Triangle extends Figure{
    public Triangle(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("inside area for Triangle");
        return dim1 * dim2 / 2;
    }
}
