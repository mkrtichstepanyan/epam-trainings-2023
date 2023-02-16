package homework_6.garik_gharibyan.chapter_8;

abstract class A7 {
    abstract void callMe();

    void callMetoo() {
        System.out.println("This is a concrete method.");
    }
}

class B7 extends A7 {

    @java.lang.Override
    void callMe() {
        System.out.println("B's implementation oh callMe.");
    }
}

public class AbstractDemo {
    public static void main(String[] args) {
        B7 b = new B7();

        b.callMe();
        b.callMetoo();
    }
}
