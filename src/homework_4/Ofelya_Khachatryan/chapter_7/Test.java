package homework_4.Ofelya_Khachatryan.chapter_7;

public class Test {
    int a;
    public int b;
    private int c;

    public Test() {

    }

    public Test(int i) {
        a = i;
    }

    public Test(int i, int j) {
        a = i;
        b = j;
    }

    public boolean equalTo(Test o) {
        if (o.a == a && o.b == b) {
            return true;
        } else {
            return false;

        }
    }

    public void meth(int i, int j) {
        i *= 2;
        j /= 2;
    }

    public void meth(Test o) {
        o.a *= 2;
        o.b /= 2;
    }

    public Test incrByTen() {
        Test temp = new Test(a + 10);
        return temp;
    }

    public void setc(int i) {
        c = i;
    }

    public int getc() {
        return c;
    }
}
