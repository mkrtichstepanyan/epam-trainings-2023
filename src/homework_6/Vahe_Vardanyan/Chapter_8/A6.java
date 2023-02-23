package homework_6.Vahe_Vardanyan.Chapter_8;

public class A6 {
    void callme(){
        System.out.println("Inside A.java`s callme method");
    }
}
class B6 extends A6{
    void callme(){
        System.out.println("Inside B`s callme method");
    }
}
class C1 extends A6{
    void callme(){
        System.out.println("Inside C`s callme method");
    }
}
class Dispatch{
    public static void main(String[] args) {
        A6 a6 = new A6();
        B6 b6 = new B6();
        C1 c1 = new C1();
        A6 r;

        r = a6;
        r.callme();

        r = b6;
        r.callme();

        r = c1;
        r.callme();
    }
}