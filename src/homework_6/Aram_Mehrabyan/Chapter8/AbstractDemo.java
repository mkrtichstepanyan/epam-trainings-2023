package homework_6.Aram_Mehrabyan.Chapter8;
abstract class A7{
    abstract void callme();
    void callmetoo(){
        System.out.println("This is concret method");
    }
}
class B7 extends A7{
    void callme(){
        System.out.println("Implementation of B7");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
    B7 b=new B7();
    b.callme();
    b.callmetoo();
    }
}
