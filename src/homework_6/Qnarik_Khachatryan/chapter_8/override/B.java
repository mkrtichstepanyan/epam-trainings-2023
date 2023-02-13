package homework_6.Qnarik_Khachatryan.chapter_8.override;

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k - this overrides show() in A
    void show() {
        super.show(); //A's show
        System.out.println("k: " + k);
    }
}
