package homework_6.Shushanik_Araqelyan.chapter8;
abstract  class A6{
    abstract void callme();
    void callmetoo(){
        System.out.println(" This is a concrete method.");
    }
}
class B6 extends A6{
    void callme(){
        System.out.println(" B's implementation of callme .");
    }
}
public class AbstractDemo {
    public static void main(String[] args) {
        B6 b = new B6 ();
        b. callme();
        b. callmetoo();
    }
}
