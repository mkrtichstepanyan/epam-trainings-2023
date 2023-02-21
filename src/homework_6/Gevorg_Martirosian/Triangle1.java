package homework_6.Gevorg_Martirosian;

public class Triangle1 extends Figure1{
    public Triangle1(double a, double b) {
        super(a, b);
    }

    double area(){
        System.out.println("inside area for Triangle");
        return dim1 * dim2 / 2;
    }
}
