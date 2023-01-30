package homework_4.Robert_Nazaryan.Chapter_7;

public class Test3 {

    int a, b;

    Test3(int i, int j) {
        a = i;
        b = j;
    }

    void meth(Test3 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
