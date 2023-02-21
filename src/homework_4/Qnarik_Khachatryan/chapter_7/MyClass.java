package homework_4.Qnarik_Khachatryan.chapter_7;

//Local variable type inference with a user-defined class type
class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}
