package homework_4.Alina_Mkhoyan.chap_7;

public class AccessTest {
    public static void main(String[] args) {
            Test5 ob = new Test5();

            ob.a = 10;
            ob.b = 20;

//        ob.c = 100 // ERROR!

            ob.setc(10); // OK
            System.out.println("a, b and c: " + ob.a + " " + ob.b + " " + ob.getc());
        }
}
