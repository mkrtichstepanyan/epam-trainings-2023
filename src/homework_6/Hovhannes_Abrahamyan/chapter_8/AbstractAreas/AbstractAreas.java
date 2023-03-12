package homework_6.Hovhannes_Abrahamyan.chapter_8.AbstractAreas;

import homework_6.Hovhannes_Abrahamyan.chapter_8.MethodOverride.*;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(8, 5);
        Triangle t = new Triangle(10, 8);
        Figure figRef;

        figRef = r;
        System.out.println("Area is: " + figRef.area());


        System.out.println("Area is: " + figRef.area());

    }
}