package homework_6.Anna_Manukyan.chapter_8;

public class FindAreas {
    public static void main(String[] args) {
        Figure figure = new Figure(10, 10);
        Rectangle rectangle = new Rectangle(9, 5);
        Triangle triangle = new Triangle(10, 8);
        Figure figRef;

        figRef = rectangle;
        System.out.println("Figure area is " + figRef.area());

        figRef = triangle;
        System.out.println("Figure area is " + figRef.area());

        figRef = figure;
        System.out.println("Figure area is " + figRef.area());
    }
}
