package homework_6.Nelli_Poghosyan.chapter_8;

import homework_6.DIana_Melkonyan.chapter_8.AClass;
import homework_6.DIana_Melkonyan.chapter_8.BClass;
import homework_6.DIana_Melkonyan.chapter_8.CClass;

public class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6();
        B6 b = new B6();
        C1 c = new C1();

        A6 r;

        r =a;
        r.callme();

        r =b;
        r.callme();

        r = c;
        r.callme();

    }
}
