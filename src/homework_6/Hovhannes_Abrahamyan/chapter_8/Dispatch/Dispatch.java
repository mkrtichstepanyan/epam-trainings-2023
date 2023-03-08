package homework_6.Hovhannes_Abrahamyan.chapter_8.Dispatch;

import homework_6.Hovhannes_Abrahamyan.chapter_8.Abstract.A;

public class Dispatch {
    public static void main(String[] args) {
        B b7 = new B();
        C c7 = new C();

        A r;


        r = b7;
        b7.callMe();

        r = c7;
        c7.callMe();
    }
}