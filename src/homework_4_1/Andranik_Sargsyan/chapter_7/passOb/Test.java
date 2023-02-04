package homework_4_1.Andranik_Sargsyan.chapter_7.passOb;

public class Test {
    int a, b;

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equals(Test o){
        if (o.a == a && o.b == b ){
            return true;
        }else {
            return false;
        }
    }
}
