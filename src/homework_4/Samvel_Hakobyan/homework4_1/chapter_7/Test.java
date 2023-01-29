package homework_4.Samvel_Hakobyan.homework4_1.chapter_7;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equaITo(Test o) {
        if (o.a == a && o.b == b)
            return true;
        else return false;
    }
}
