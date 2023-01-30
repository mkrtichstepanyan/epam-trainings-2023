package homework_4.Anna_Manukyan.chapter_7;

//Objects may be passed to methods
public class Test {
    int a;
    int b;

    Test() {
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalsTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void methWithObj(Test o) {
        o.a *= 2;
        o.b /= 2;
    }
}
