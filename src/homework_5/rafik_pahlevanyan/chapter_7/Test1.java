package homework_5.rafik_pahlevanyan.chapter_7;

//Objects may be passed to methods
public class Test1 {
    int a, b;

    Test1(int i, int j) {
        a = i;
        b = j;
    }

    //return true if o is equal to the invoking object
    boolean equalTo(Test1 o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
}
