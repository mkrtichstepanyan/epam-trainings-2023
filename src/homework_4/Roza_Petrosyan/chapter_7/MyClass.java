package homework_4.Roza_Petrosyan.chapter_7;

// Local variable type inference with a user-defined class type.
public class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0) {
            this.i = k;
        }
    }
}
