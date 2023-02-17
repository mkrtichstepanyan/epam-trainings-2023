package homework_6.Hovhannes_Abrahamyan.chapter_8.MethodOverride;

import homework_6.Hovhannes_Abrahamyan.chapter_8.MethodOverride.Figure;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figRef;

        figRef = r;
        System.out.println("Area is: " + figRef.area());

        figRef = t;
        System.out.println("Area is: " + figRef.area());

        figRef = f;
        System.out.println("Area is: " + figRef.area());
    }
}