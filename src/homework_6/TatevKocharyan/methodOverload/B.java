package homework_6.TatevKocharyan.methodOverload;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        super.show();
        System.out.println(msg + k);
    }
}