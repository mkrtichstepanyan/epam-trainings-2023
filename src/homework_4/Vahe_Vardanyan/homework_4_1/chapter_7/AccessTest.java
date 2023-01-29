package homework_4.Vahe_Vardanyan.homework_4_1.chapter_7;

public class AccessTest {
    public static void main(String[] args) {

        Test5 ob = new Test5();

        ob.a = 10;
        ob.b = 20;
        ob.c = 100;

        ob.sect(100);
        System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}

