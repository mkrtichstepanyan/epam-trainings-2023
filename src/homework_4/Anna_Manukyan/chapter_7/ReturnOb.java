package homework_4.Anna_Manukyan.chapter_7;

public class ReturnOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(2);
        Test1 ob2;
        ob2 = ob1.incrByTen();
        System.out.println("Ob1.a = " + ob1.a);
        System.out.println("Ob2.a = " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("Ob2.a = " + ob2.a);

    }
}
