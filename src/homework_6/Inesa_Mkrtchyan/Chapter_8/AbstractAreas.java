package homework_6.Inesa_Mkrtchyan.Chapter_8;

class AbstractAreas {
    public static void main(String args[]) {
       // Figure_abs f = new Figure_abs(10, 10); // error
        Rectangle_abs r = new Rectangle_abs(9, 5);
        Triangle_abs t = new Triangle_abs(10, 8);
        Figure_abs figref;
        figref = r;
        System.out.println("Area is " + figref.area());
        figref = t;
        System.out.println("Area is " + figref.area());
    }
}