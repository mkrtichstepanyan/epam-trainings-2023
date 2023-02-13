package homework_6.Radik_Manasyan.chapter8;

public class A {
    int i;
    int j;

    A() {

    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i и j: " + i + " " + j);

    }

    void showIJ() {
        System.out.println("i и j: " + i + " " + j);
    }

    void callMe() {
        System.out.println("B методе callMe() изкласса А");
    }
}

class B extends A {
    int k;

    B() {

    }

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void showK() {
        System.out.println("k: " + k);
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }

    void sum() {
        System.out.println("i + j + k: " + (i + j + k));
    }

    void callMe() {
        System.out.println("B методе callMe() изкласса B");
    }
}

class C extends A {
    void callMe() {
        System.out.println("B методе callMe() изкласса C");
    }
}
