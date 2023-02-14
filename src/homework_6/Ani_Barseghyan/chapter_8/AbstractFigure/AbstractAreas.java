package homework_6.Ani_Barseghyan.chapter_8.AbstractFigure;

public class AbstractAreas {
    public static void main(String[] args) {
        // Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figureF;

        figureF = r;
        System.out.println("Area is " + figureF.area());

        figureF = t;
        System.out.println("Area is " + figureF.area());
    }
}
