package homework_6.Lilit_Adamyan.chapter_8.Overriding;

public class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k: " + k);
    }

    void show(String msg){
        System.out.println(msg + k);
    }
}
