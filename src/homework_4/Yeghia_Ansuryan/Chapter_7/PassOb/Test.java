package homework_4.Yeghia_Ansuryan.Chapter_7.PassOb;

public class Test {
    int a, b;

    Test(int i,  int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
