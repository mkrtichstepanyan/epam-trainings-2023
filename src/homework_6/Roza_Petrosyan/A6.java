package homework_6.Roza_Petrosyan;

public class A6 {
    int i, j;

    public A6(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B6 extends A6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k is: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
