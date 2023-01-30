package homework_4.Alina_Vardanovna.chapter7;

public class AccessTestDemo {
    public static void main(String[] args) {

        AccessTest ob = new AccessTest();

        ob.a = 10;
        ob.b = 20;
        ob.setc(100);
        System.out.println("a, b, և с: " + ob.a + " "
                + ob.b + " " + ob.getc());

    }
}
