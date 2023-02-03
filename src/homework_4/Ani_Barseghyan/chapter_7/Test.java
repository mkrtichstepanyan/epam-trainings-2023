package homework_4.Ani_Barseghyan.chapter_7;

public class Test {
    int a, b;
    int c;

    int defA;
    public int pubB;
    private int privC;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Test(int i) {
        c = i;
    }

    Test() {

    }

    Test incrByTen() {
        Test temp = new Test(c + 10);
        return temp;
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth1(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }

    void setC(int i) {
        privC = i;
    }

    int getC() {
        return privC;
    }
}
