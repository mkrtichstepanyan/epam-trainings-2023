package homework_6.Shushanik_Araqelyan.chapter8;
class A5{
    void callme(){
        System.out.println(" Inside A's callme method");
    }
}
class B5 extends A5{
    void callme(){
        System.out.println(" Inside B5's callme method");
    }

}
class C2 extends A5{
    void callme(){
        System.out.println(" Inside B5's callme method");
    }
}
public class Dispatch {
    public static void main(String[] args) {
        A5 a = new A5();
        B5 b = new B5();
        C2 c = new C2();
        A r;
        r = A5;
        r.callme();
        r = B5;
        r.callme();
        r = C2();
        r.callme();
    }
}
