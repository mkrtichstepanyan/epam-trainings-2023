package homework_4.Varsik_Pijoyan.chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test(10);
        ob.a = 10;
        ob.b = 20;

        ob.setC(100);
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
