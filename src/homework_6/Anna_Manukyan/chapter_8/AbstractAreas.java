package homework_6.Anna_Manukyan.chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
        //AbstractFigure figure = new AbstractFigure(10, 10);
        AbstractRectangle rectangle = new AbstractRectangle(9, 5);
        AbstractTriangle triangle = new AbstractTriangle(10, 8);
        AbstractFigure figRef;

        figRef = rectangle;
        System.out.println("Figure area is " + figRef.area());

        figRef = triangle;
        System.out.println("Figure area is " + figRef.area());

    }
}
