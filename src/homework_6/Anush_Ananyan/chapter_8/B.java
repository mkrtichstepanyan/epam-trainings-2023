package homework_6.Anush_Ananyan.chapter_8;

public class B extends A {
    int k;
    int total;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
        //total = i+ l;
    }

    B() {
        System.out.println("Inside B's constructor.");
    }

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

        void show() {
        System.out.println("k: " + k);
    }
//    void show() {
//        super.show();
//        System.out.println("k: " + k);
//    }

    void show(String msg) {
        System.out.println(msg + k);
    }
    void callme() {
        System.out.println("Inside B's callme method");
    }
}
