package homework_4.Inesa_Mkrtchyan.Homework4_1.Chapter_7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }
    Test(){}

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }
    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
