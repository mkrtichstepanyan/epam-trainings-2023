package homework_4.Armen_Martirosyan.Chapter_7;

public class Test2 {
    int a, b;

    Test2(int i, int j) {
        this.a = i;
        this.b = j;
    }

    void meth(Test2 o) {
        o.a *= 2;
        o.b /= 2;
    }
}
