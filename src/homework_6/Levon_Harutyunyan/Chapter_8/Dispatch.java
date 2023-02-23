package homework_6.Levon_Harutyunyan.Chapter_8;

public class Dispatch {
    public static void main(String[] args) {

        A4 a = new A4();
        B5 b = new B5();
        C1 c = new C1();

        A4 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }
}
