package homework_6.Ani_Barseghyan.chapter_8.Dispatch;

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
