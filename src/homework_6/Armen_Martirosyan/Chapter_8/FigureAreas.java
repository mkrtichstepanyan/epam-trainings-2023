package homework_6.Armen_Martirosyan.Chapter_8;

public class FigureAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);

        System.out.println("Area is: " + r.area());
        System.out.println("Area is: " + t.area());
        System.out.println("Area is: " + f.area());
    }
}
