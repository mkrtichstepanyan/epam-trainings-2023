package homework_6.Sofya_Ghazaryan.Chapter_8;

public class B_5 extends A_5 {
    int k;

    B_5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
