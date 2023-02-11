package homework_6.Roza_Petrosyan;

public class Dispatch {
    public static void main(String[] args) {
        A7 a7 = new A7();
        B7 b7 = new B7();
        C7 c7 = new C7();

        A7 r;

        r = a7;
        a7.callMe();

        r = b7;
        b7.callMe();

        r = c7;
        c7.callMe();
    }
}
