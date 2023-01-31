package homework_4.Vardan_Mkrtchyan.chapter7;

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(122, 100);
        Test ob2 = new Test(122, 100);
        Test ob3 = new Test(11, 12);
        System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 " + ob1.equalTo(ob3));
    }
}
class Test{
    int a, b;
    Test(int i, int j){
        a = i;
        b = j;
    }
    boolean equalTo(Test o){
        if(o.a == a && o.b == b) return true;
        else return false;
    }
}
