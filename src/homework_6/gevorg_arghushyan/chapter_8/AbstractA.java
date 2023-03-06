package homework_6.gevorg_arghushyan.chapter_8;

public abstract class AbstractA {
    abstract void callme();
    void callmetoo(){
        System.out.println("This is specific method");
    }
}
class B1 extends AbstractA{
    void callme(){
        System.out.println("implementation callme() in B1");
    }
}
class AbstractDemo{
    public static void main(String[] args) {
        B1 b = new B1();
        b.callme();
        b.callmetoo();
    }
}
