package homework_6.Sofya_Ghazaryan.Chapter_8;

public class B_4 extends A_4 {
    int k;

    B_4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
