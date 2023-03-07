package homework_6.Arsen_Kazaryan.chapter_8;

public class B4 extends A4 {

    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }
}
