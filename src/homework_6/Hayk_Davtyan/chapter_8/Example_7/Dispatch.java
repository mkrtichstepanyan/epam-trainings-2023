package homework_6.Hayk_Davtyan.chapter_8.Example_7;

import homework_6.Hayk_Davtyan.chapter_8.Example_7.A;
import homework_6.Hayk_Davtyan.chapter_8.Example_7.B;
import homework_6.Hayk_Davtyan.chapter_8.Example_7.C;

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
