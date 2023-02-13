package homework_6.Lilit_Adamyan.chapter_8.Abstract;

public class AbstractAreas {
    public static void main(String[] args) {
      //  Figure f = new Figure(10, 10); illegal
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10,8);

        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());


    }
}
