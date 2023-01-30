package homework_4.Gevorg_Martirosian.chapter_7;

public class MyClass {
    private int i;

    MyClass(int k) {
        i = k;
    }

    public int getI() {
        return i;
    }

    public void setI(int k) {
        if (k >= 0) {
            i = k;
        }
    }
}
