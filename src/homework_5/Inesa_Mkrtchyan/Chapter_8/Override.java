package homework_5.Inesa_Mkrtchyan.Chapter_8;

class A2 {
    int i;
    int j;

    A2(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}

public class Override {
    public static void main(String[] args) {
        B2 subOb = new B2(1, 2, 3);
        subOb.show();
    }
}
