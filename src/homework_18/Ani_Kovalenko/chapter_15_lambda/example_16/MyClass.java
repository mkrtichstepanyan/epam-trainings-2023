package homework_18.Ani_Kovalenko.chapter_15_lambda.example_16;

public class MyClass<T> {
    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    public T getVal() {
        return val;
    }
}
