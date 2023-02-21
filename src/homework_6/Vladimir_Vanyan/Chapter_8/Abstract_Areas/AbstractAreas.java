package homework_6.Vladimir_Vanyan.Chapter_8.Abstract_Areas;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }

}
