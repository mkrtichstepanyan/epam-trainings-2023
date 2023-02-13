package homework_6.Nona_Asatryan.chapter8;

public class AbstractAreas {
    public static void main(String[] args) {

        RectangleAbstract r = new RectangleAbstract(9, 5);
        TriangleAbstract t = new TriangleAbstract(10, 8);
        FigureAbstract figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
