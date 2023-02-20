package homework_6.Radik_Manasyan.chapter8;

public class AbstractArea {
    public static void main(String[] args) {
        RectangleF r = new RectangleF(9, 5);
        TriangleF t = new TriangleF(10, 8);
        AbstractFigure figref;

        figref = r;
        System.out.println("Плoщaдь равн " + figref.area());
        figref = t;
        System.out.println("Плoщaдь равн " + figref.area());

    }
}
