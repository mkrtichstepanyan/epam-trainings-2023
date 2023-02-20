package homework_6.Roza_Petrosyan.chapter_8.Dispatch;

public class Dispatch {
    public static void main(String[] args) {
        A a7 = new A();
        B b7 = new B();
        C c7 = new C();

        A r;

        r = a7;
        a7.callMe();

        r = b7;
        b7.callMe();

        r = c7;
        c7.callMe();
    }
}
