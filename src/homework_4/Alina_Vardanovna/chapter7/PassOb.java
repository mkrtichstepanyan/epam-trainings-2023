package homework_4.Alina_Vardanovna.chapter7;

public class PassOb {

    int a, b;

    PassOb(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(PassOb o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }

}
