package homework_6.gohar_hakobyan.chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
       //  FigureAbst f = new Figure(10, 10); illegial now

        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

    }
}
