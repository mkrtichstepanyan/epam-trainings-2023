package homework_6.Zara_Avetyan;

public class B6 extends A5_6 {
    int k;

    B6(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
