package homework_6.Levon_Harutyunyan.Chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle t = new Triangle(10, 8);
        FigureAbstract  figref;

        figref = r;
        System.out.println("Area is " + figref.area());

//        figref = t;/home/levon/Desktop/New Folder/B2.java
        System.out.println("Area is " + figref.area());
    }
}
