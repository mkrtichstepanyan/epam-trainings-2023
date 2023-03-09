package homework_6.Qnarik_Khachatryan.chapter_8.override;

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // display k - this overrides show() in A.java
    void show() {
        super.show(); //A.java's show
        System.out.println("k: " + k);
    }
}
