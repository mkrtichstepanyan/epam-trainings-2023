package homework_4.gohar_hakobyan.chapter_7;

public class TestCallByValue {
    int a, b;

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    TestCallByValue(int i, int j) {
        a = i;
        b = j;
    }

    void meth(TestCallByValue o) {
        o.a *= 2;
        o.b /= 2;
    }

}
