package homework_6.Anush_Ananyan.chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
        //Figure1 f = new Figure1(10, 10)

        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);

        Figure1 figref;

        figref = r;
        System.out.println("Area is "+ figref.area());

        figref = t;
        System.out.println("Area is "+ figref.area());
    }
}

