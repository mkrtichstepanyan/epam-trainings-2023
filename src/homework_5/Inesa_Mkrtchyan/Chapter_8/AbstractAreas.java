package homework_5.Inesa_Mkrtchyan.Chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
        //Figure f = new Figure(10,10);//error
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);
        Figure f;
        f = r;
        System.out.println("Area is " + f.area());
        f = t;
        System.out.println("Area is " + f.area());
    }
}
