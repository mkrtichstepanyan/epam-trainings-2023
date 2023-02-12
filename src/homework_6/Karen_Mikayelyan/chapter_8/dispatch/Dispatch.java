package homework_6.Karen_Mikayelyan.chapter_8.dispatch;

class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        a.callMe();

        r = b;
        b.callMe();

        r = c;
        c.callMe();
    }
}
