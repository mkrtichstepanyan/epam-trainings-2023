package homework_6.gohar_hakobyan.chapter_8;

public class Access {
    public static void main(String[] args) {
        B supOb = new B();

        supOb.setij(10, 12);
        supOb.sum();
//        System.out.println("Total is " + supOb.total); Not compile
    }
}
