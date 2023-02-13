package homework_6.Karen_Mikayelyan.chapter_8.access;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.setIJ(10, 12);

        subOb.sum();
        System.out.println("Total is: " + subOb.total);
    }
}
