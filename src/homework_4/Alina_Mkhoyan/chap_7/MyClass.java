package homework_4.Alina_Mkhoyan.chap_7;

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
