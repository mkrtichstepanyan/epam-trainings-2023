package homework_6.Qnarik_Khachatryan.chapter_8.overload;

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    // overload, because The version of show( ) in B takes a string parameter. This
    //makes its type signature different from the one in A.java, which takes no parameters
    void show(String msg) {
        System.out.println(msg + k);
    }
}
