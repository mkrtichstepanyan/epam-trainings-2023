package homework_6.Vladimir_Vanyan.Chapter_8.Dispatch;

public class Dispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        A r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();
    }

}
