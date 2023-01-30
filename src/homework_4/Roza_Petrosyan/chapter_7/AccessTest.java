package homework_4.Roza_Petrosyan.chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test5 ob = new Test5();

        // these are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;

        // thi is not OK, and will cause an error
//        ob.c = 100 // ERROR!

        // You must access c through its methods
        ob.setc(10); // OK
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
    }
}
