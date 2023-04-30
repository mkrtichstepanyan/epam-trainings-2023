package homework_18.Ani_Kovalenko.chapter_15_lambda.example_17;

public class MyClass<T> {

    private T val;

    MyClass(T v) {
        val = v;
    }

    MyClass() {
        val = null;
    }

    T getVal() {
        return val;
    }

}
