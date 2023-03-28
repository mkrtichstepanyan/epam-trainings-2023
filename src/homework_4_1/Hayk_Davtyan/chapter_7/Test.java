package homework_4_1.Hayk_Davtyan.chapter_7;

public class Test {
    int a, b;
    Test(int i,int j){
        a = i;
        b = j;
    }
    boolean equalTo(Test o){
        if (o.a == a && o.b == b) return true;
        else return false;
    }
}
