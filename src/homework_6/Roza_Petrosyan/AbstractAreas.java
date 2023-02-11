package homework_6.Roza_Petrosyan;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle2 r = new Rectangle2(8, 5);
        Triangle2 t = new Triangle2(10, 8);
        Figure2 figRef;

        figRef = r;
        System.out.println("Area is: " + figRef.area());

        figRef = t;
        System.out.println("Area is: " + figRef.area());

    }
}
