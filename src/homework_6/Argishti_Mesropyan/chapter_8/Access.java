package homework_6.Argishti_Mesropyan.chapter_8;

public class Access {
    public static void main(String[] args) {
        SupB subOb = new SupB();

        subOb.setij(10, 20);
        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
