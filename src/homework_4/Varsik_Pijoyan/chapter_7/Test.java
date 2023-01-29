package homework_4.Varsik_Pijoyan.chapter_7;

public class Test {
    int a;
    public  int b;
    private int c;

    Test(int i, int j){
        a = i;
        b = j;
    }

    void  meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }

    public Test(int i) {
        a = i;
    }


    boolean equalTo(Test o){
        if (o.a == a && o.b == b){
            return true;
        }else{
            return false;
        }
    }
    void setC(int i){
        c = i;
    }

    int getC(){
        return c;
    }




    public Test incrByTen() {
        Test temp = new Test(a +10);
        return temp;
    }
}
