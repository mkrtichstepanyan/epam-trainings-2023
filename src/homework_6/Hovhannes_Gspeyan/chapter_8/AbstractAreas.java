package homework_6.Hovhannes_Gspeyan.chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
     //   Figure2 f = new Figure2(10,10);  don't allowed
        Rectangle2 r = new Rectangle2(9,5);
        Triangle2 t = new Triangle2(10,8);
        Figure2 figRef;

        figRef = r;
        System.out.println("Area is: " + figRef.area());

        figRef = t;
        System.out.println("Area is: " + figRef.area());

    }
}
