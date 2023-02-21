package homework_6.Alina_Mkhoyan.chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
//        FigureAbstract fa = new FigureAbstract(10,10);
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);

        FigureAbstract fa;
        fa = r;
        System.out.println("Area is " + fa.area());

        fa = t;
        System.out.println("Area is " + fa.area());
    }
}