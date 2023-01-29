package homework_4.Roza_Petrosyan.chapter_7;

// Objects may pass to methods
public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    // return true if o is equal to the invoking object
    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) {
            return true;
        }else {
            return false;
        }
    }
}
