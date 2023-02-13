package homework_6.Nona_Asatryan.chapter8;

public class B5 extends A5 {
    int k;

    B5(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    @Override
    void show() {
        super.show();     // this calls A5's show
        System.out.println("k: " + k);
    }
}
