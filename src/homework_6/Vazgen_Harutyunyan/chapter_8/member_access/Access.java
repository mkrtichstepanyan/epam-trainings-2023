package homework_6.Vazgen_Harutyunyan.chapter_8.member_access;

public class Access {
    public static void main(String[] args) {
        B subOb = new B();

        subOb.set_i_j(10,20);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
