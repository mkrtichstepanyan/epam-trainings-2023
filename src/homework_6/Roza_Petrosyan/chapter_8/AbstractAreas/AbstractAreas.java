package homework_6.Roza_Petrosyan.chapter_8.AbstractAreas;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 5);
        Triangle t = new Triangle(10, 8);
        Figure figRef;

        figRef = r;
        System.out.println("Area is: " + figRef.area());

        figRef = t;
        System.out.println("Area is: " + figRef.area());

    }
}
