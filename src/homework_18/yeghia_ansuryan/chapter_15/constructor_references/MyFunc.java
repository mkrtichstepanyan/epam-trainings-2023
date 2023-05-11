package homework_18.yeghia_ansuryan.chapter_15.constructor_references;

public interface MyFunc {
    MyClass func(int n);
}

class MyClass {
    private int val;

    MyClass(int v) {
        val = v;
    }

    MyClass() {
        val = 0;
    }

    int getVal() {
        return val;
    }
}
