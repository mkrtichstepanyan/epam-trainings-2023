package homework_6.Aram_Mehrabyan.Chapter8;
class A6{
    void callme(){
        System.out.println("Inside A6  calls");
    }
}
class B6 extends A6{
    void callme(){
        System.out.println("Inside B6  calls");
    }
}
class C6 extends A6{
    void callme(){
        System.out.println("Inside C6  calls");
    }
}
public class Dispatch {
    public static void main(String[] args) {
    A6 a=new A6();
    B6 b=new B6();
    C6 c=new C6();
    A6 r=a;
    r.callme();
    r=b;
    r.callme();
    r=c;
    r.callme();

    }
}
