package homework_6.gohar_hakobyan.chapter_8;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        E e = new E();
        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = e;
        r.callme();
    }
}
