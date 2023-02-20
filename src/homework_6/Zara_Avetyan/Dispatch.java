package homework_6.Zara_Avetyan;

public class Dispatch {
    public static void main(String[] args) {

        A7 a = new A7();
        B7 b = new B7();
        C7 c = new C7();
        A7 r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
