package homework_6.Anush_Ananyan.chapter_8;

public class Access {
    public static void main(String[] args) {
        B subOb = new B() ;
        subOb.setil(10, 12);
        subOb.sum();
        System.out.println("Total is " +subOb.total);
    }
}
