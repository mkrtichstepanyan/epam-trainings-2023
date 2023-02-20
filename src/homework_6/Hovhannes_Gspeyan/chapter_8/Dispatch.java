package homework_6.Hovhannes_Gspeyan.chapter_8;

public class Dispatch {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();
        A3 r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
