package homework_6.Nelli_Poghosyan.chapter_8;

public class Access {
    public static void main(String[] args) {
        B1 subOb = new B1();

        subOb.setij(10, 20);

        subOb.sum();
        System.out.println("Total is " + subOb.total);
    }
}
