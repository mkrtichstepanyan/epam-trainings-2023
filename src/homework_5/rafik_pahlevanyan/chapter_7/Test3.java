package homework_5.rafik_pahlevanyan.chapter_7;

//Objects are passed through their references
public class Test3 {
    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    //pass an object
    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
