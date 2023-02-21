package homework_6.Sofya_Ghazaryan.Chapter_8;

public class Dispatch {
    public static void main(String[] args) {
        A_6 a = new A_6();
        B_6 b = new B_6();
        C_6 c = new C_6();

        A_6 r;

        r = a;
        r.callMe();

        r = b;
        r.callMe();

        r = c;
        r.callMe();
    }
}
