package homework_6.Armen_Martirosyan.Chapter_8;

public class B2 extends A2 {
    int k;

    B2(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}
