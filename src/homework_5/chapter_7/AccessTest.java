package homework_5.chapter_7;

/**
 * testing Test4 class
 */
public class AccessTest {
    public static void main(String[] args) {
        Test4 ob = new Test4();

        ob.a = 10;
        ob.b = 20;

//        This is not ok, and will cause an error
//        ob.c = 100; //Error!

        // we must access c through its methods

        ob.setC(100); //ok
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
