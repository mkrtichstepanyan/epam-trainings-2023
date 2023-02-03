package homework_4.Ani_Kovalenko.Chapter_7;

public class Test {
    int a, b;


    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    Test() {

    }

    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    Boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }
    Test (int i){
        a = i;
    }
    Test incrByTen (){
        Test temp = new Test (a+10);
        return temp;
    }
}
