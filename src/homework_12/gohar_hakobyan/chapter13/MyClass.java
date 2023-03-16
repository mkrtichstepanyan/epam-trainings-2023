package homework_12.gohar_hakobyan.chapter13;

public class MyClass {
    int a;
    int b;

    MyClass(int i, int j) {
        a = i;
        b = j;

    }

    MyClass(int i) {
        this(i, i);
    }

    MyClass() {
        this(0);
    }
}