package homework_4.Varsik_Pijoyan.chapter_7;

public class AccessTest {
    public static void main(String[] args) {
        Test ob = new Test();
        //These are OK, a and b may be accessed directly
        ob.a = 10;
        ob.b = 20;
        //This is not OK and will cause an error
        //ob.c = 100; //ERROR!
        ob.setC(100); //OK
        System.out.println("a, b, and c: " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
