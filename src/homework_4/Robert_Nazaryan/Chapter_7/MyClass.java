package homework_4.Robert_Nazaryan.Chapter_7;

public class MyClass {

    private int i;

    MyClass(int k) {
        i = k;
    }

    int getI() {
        return i;
    }

    void setI(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}
