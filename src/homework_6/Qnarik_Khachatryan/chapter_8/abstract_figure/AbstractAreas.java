package homework_6.Qnarik_Khachatryan.chapter_8.abstract_figure;


class AbstractAreas {
    public static void main(String[] args) {
//        Figure f = new Figure(10, 10);  illegal now
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        Figure figref; // this is OK, no object is created

        figref = r;
        System.out.println("Area is " + figref.area());

        figref = t;
        System.out.println("Area is " + figref.area());
    }
}
