package homework_4.gohar_hakobyan.chapter_7;

public class RetOb {
    public static void main(String[] args) {
        TestRetOb ob1 = new TestRetOb(2);
        TestRetOb ob2;

        ob2 = ob1.incrByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);

        ob2 = ob2.incrByTen();
        System.out.println("ob2.a after second increase: " + ob2.a);
    }
}
