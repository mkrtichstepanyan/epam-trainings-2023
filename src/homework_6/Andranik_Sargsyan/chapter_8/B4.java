package homework_6.Andranik_Sargsyan.chapter_8;

public class B4 extends A4 {

    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        System.out.println("k: " + k);
    }
}
