package homework_6.Ani_Barseghyan.chapter_8.Access;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.set_IJ(10, 20);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }

}
