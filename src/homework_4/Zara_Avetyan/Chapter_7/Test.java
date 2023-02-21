package homework_4.Zara_Avetyan.Chapter_7;

public class Test {
    int a;
    public int b;
    private int c;

    Test() {
        //nothing
    }

    Test(int i, int j) {
        a = i;
        b = j;
    }

    boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;
        }
    }

    void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    Test(int i) {
        a = i;
    }

    Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    void setc(int i){
        c=i;
    }
    int getc(){
        return c;
    }
}
