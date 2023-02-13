package homework_6.Varsik_Pijoyan.chapter_8.AbstractClasses;

public class AbstractArea {
    public static void main(String[] args) {
        RectangleAbstr r = new RectangleAbstr(9, 5);
        TriangleAbstr t = new TriangleAbstr(10, 8);
        FigureAbstr figref;

        figref = r;
        System.out.println("Area is: " + figref.area());

        figref = t;
        System.out.println("Area is: " + figref.area());

    }
}
