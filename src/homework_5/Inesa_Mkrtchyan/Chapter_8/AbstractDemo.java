package Homework5.Inesa_Mkrtchyan.Chapter_8;
abstract class A4{
    abstract void callme();
    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
class B4 extends A4{
    void callme(){
        System.out.println("B's implementation of callme.");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        B4 b = new B4();
        b.callme();
        b.callmetoo();
    }
}
