package homework_4.Aram_Mehrabyan.chapter7;

public class Test1 {
    void meth(int i, int j){
        i*=2;
        j/=2;
    }
}
class CallByValue{
    public static void main(String []args){
        Test1 ob=new Test1();
        int a=15;
        int b=20;
        System.out.println("Before call: "+a+" "+b);
        ob.meth(15,20);
        System.out.println("After call: "+a+" "+b);


    }
}
