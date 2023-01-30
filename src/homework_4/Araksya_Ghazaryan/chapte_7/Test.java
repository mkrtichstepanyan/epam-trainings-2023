package homework_4.Araksya_Ghazaryan.chapte_7;

public class Test {
    int a,b;

    Test (int i, int j){
        a = i;
        b = j;
    }

    Test (){

    }

    boolean equalTo(Test o) {
        if (o.a ==a && o.b == b) return true;
        else return false;
    }

    void meth ( int i, int j){
        i *= 2;
        j *= 2;
    }

    void meth(Test o){
        o.a *= 2;
        o.b /= 2;
    }
    Test(int i){
        a = i;
    }
    Test incrByTen(){
        Test temp = new Test(a +10);
        return temp;
}
}



