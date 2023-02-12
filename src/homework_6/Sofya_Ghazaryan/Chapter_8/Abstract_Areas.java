package homework_6.Sofya_Ghazaryan.Chapter_8;

public class Abstract_Areas {
    public static void main(String[] args) {
        //Figure f = new Figure(10, 10); illegal now
        Rectangle_Abstract r = new Rectangle_Abstract(9, 5);
        Triangle_Abstract t = new Triangle_Abstract(10, 8);
        Figure_Abstract figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

    }
}
