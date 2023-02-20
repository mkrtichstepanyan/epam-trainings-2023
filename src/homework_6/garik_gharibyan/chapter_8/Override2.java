package homework_6.garik_gharibyan.chapter_8;

class A5 {
    int i;
    int j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B5 extends A4 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}

public class Override2 {
    public static void main(String[] args) {
        B5 subObB5 = new B5(1, 2, 3);

        subObB5.show("This is k: ");
        subObB5.show();

    }
}
