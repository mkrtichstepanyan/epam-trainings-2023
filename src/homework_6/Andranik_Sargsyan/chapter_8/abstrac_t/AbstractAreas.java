package homework_6.Andranik_Sargsyan.chapter_8.abstrac_t;

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
