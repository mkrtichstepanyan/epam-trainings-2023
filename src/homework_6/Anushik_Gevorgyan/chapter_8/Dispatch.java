package homework_6.Anushik_Gevorgyan.chapter_8;

public class Dispatch {
    public static void main(String[] args) {
        A5 a5 = new A5();
        B5 b5 = new B5();
        C1 c1 = new C1();
        A5 r;
        r = a5;
        r.callme();
        r = c1;
        r.callme();
    }
}
