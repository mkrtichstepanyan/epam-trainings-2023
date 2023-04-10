package homework_6.Karen_Mikayelyan.chapter_8.override;

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show() {
        super.show();
        System.out.println("k is: " + k);
    }

    void show(String msg) {
        System.out.println(msg + k);
    }
}
