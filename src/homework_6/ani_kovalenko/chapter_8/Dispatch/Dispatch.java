package homework_6.ani_kovalenko.chapter_8.Dispatch;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A r;

        r = a;
        r.callme();

        r = b;
        b.callme();

        r = c;
        c.callme();
    }
}
