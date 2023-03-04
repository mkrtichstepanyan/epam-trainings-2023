package homework_6.Hayk_Davtyan.chapter_8.Example_10;


class AbstractAreas {
    public static void main(String[] args) {
    //   Figure f = new Figure(10,10);                 //illegal now
       Rectangle r = new Rectangle(9,5);
       Triangle t = new Triangle(10,8);
        Figure figref;

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());

//        figref = f;
//        System.out.println("Area is " + figref.area());
    }
}
