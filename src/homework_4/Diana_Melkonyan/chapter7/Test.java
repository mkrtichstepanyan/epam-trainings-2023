package homework_4.Diana_Melkonyan.chapter7;

public class Test {
    int a, b;

    Test(int i, int j){
        a=i;
        b= j;
    }
    //return true if o is equal to the invoking object
    boolean equalTo(Test o){
        if(o.a == a && o.b ==b) return true;
        else return false;
    }
}
