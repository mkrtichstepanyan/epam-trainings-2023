package homework_6.rafik_pahlevanyan.chapter_8;

public class AbstractAreas {
    public static void main(String[] args) {
//        FigureAbstract fa = new FigureAbstract(10,10);    //illegal now
        Rectangle1 r = new Rectangle1(9, 5);
        Triangle1 t = new Triangle1(10, 8);

        FigureAbstract fa;//this is OK, no object is created

        fa = r;
        System.out.println("Area is " + fa.area());

        fa = t;
        System.out.println("Area is " + fa.area());
    }
}