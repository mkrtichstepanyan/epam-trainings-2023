package homework_6.Aram_Mehrabyan.Chapter8;
abstract class Figure1{
    double dim1;
    double dim2;
    Figure1(double a,double b){
        dim1=a;
        dim2=b;
    }
    abstract double area();
}
class Rectangle1 extends Figure1{
    Rectangle1(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Area of rectangle");
        return dim1*dim2;
    }
}
class Triangle1 extends Figure{
    Triangle1(double a,double b){
        super(a,b);
    }
    double area(){
        System.out.println("Area of triangle");
        return dim1*dim2/2;
    }
}
public class AbstractArea {
    public static void main(String[] args) {
        Figure f=new Figure(10,10);
        Rectangle r=new Rectangle(9,5);
        Triangle t=new Triangle(10,8);
        Figure figref;
        figref=f;
        System.out.println("Area is "+figref.area());
        figref=r;
        System.out.println("Area is "+figref.area());
        figref=t;
        System.out.println("Area is "+figref.area());
    }
    }

