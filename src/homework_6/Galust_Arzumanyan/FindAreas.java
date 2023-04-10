package homework_6.Galust_Arzumanyan;

class FindAreas {
    public static void main(String[] args){
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Trangle t = new Trangle(10, 8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

        figref = f;
        System.out.println("Area is " + figref.area());
    }
}
