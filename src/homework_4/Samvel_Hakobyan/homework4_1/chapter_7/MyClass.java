package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    int geti() {
        return i;
    }

    void seti(int k) {
        if (k >= 0) i = k;
    }


}
