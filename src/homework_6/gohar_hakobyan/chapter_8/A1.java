package homework_6.gohar_hakobyan.chapter_8;

public class A1 {
    int i, j;

    A1(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B1 extends A1 {
    int k;

    B1(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    //For overload
    void show(String msg) {
        System.out.println(msg + k);
    }
}