package homework_6.Lilit_Adamyan.chapter_8.Dynamic_dispatch;

public class Dispatch {
    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        C c = new C();
        A r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();

    }
}

