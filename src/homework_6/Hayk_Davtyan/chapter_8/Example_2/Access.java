package homework_6.Hayk_Davtyan.chapter_8.Example_2;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();
        subOb.setij(10,12);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
