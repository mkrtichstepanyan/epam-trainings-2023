package homework_6.Araksya_Ghazaryan.chapter_8;

public class FindAreas {
    public static void main(String[] args) {
        Figure f = new Figure(10, 10);
        Rectengle r = new Rectengle(9,5);
        Triangle t = new Triangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println(" Area is " + figref.area());

        figref = t;
        System.out.println(" Area is " + figref.area());

        figref = f;
        System.out.println(" Area is " + figref.area());
    }
}