package homework_6.Radik_Manasyan.chapter8;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Плoщaдь равн " + figref.area());
        figref = t;
        System.out.println("Плoщaдь равн " + figref.area());
        figref = f;
        System.out.println("Плoщaдь равн " + figref.area());
    }
}
