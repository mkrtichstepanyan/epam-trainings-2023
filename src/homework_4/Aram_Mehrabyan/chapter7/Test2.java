package homework_4.Aram_Mehrabyan.chapter7;

public class Test2 {
    int a,b;
    Test2(int i,int j){
        a=i;
        b=j;
    }
    void meth(Test2 o){
      o.a*=2;
      o.b/=2;
    }
}
class CallByRefValue{
    public static void main(String []args){
        Test2 ob=new Test2(15,20);
        System.out.println("Before call: "+ob.a+" "+ob.b);
        ob.meth(ob);
        System.out.println("After call: "+ob.a+" "+ob.b);


    }
}
