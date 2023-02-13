package homework_6.Ofelya_Khachatryan.chapter_8;

public class B extends A {

    int i;
    int k;
    int total;

    B() {
        System.out.println("Inside B's constructor.");
    }

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        total = i + j;
        System.out.println("i+j+k: " + (i + j + k));
    }

    void show(String msg) {
//        System.out.println("i in superclass: "+super.i);
//        System.out.println("i in subclass: "+i);
//        super.show();
//        System.out.println(("k: "+k));
        System.out.println(msg + k);
    }

    @java.lang.Override
    void callme() {
//        System.out.println("Inside B's callme method");

    }
//    void meth(){                        ERROR!
//        System.out.println("Illegal!");
//    }
}
