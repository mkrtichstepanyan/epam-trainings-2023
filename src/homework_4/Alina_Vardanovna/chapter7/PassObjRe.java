package homework_4.Alina_Vardanovna.chapter7;

public class PassObjRe {

    int a, b;

    PassObjRe(int i, int j) {
        a = i;
        b = j;
    }

    void meth(PassObjRe o) {
        o.a *= 2;
        o.b /= 2;
    }

}
