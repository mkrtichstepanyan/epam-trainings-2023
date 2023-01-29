package homework_4.Aram_Mehrabyan.chapter7;

public class Test {
    int a,b;
    Test(int i,int j){
        a=i;
        b=j;
    }
    boolean equalTo(Test o){
        if(o.a==a&&o.b==b)
            return  true;
        else
            return false;
    }
}
class PassOb{
    public static  void main(String []args){
        Test ob1=new Test(10,20);
        Test ob2=new Test(10,20);
        Test ob3=new Test(5,4);
        System.out.println("ob1==ob2:"+ob1.equalTo(ob2));
        System.out.println("ob1==ob3:"+ob1.equalTo(ob3));
    }
}
