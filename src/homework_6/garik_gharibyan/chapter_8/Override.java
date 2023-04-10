package homework_6.garik_gharibyan.chapter_8;

class A4 {
    int i;
    int j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @java.lang.Override
    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B4 subObB4 = new B4(1, 2, 3);
        subObB4.show();
    }
}
