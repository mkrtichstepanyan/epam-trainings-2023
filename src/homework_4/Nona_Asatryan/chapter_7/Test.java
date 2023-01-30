package homework_4.Nona_Asatryan.chapter_7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // pass an object
    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
