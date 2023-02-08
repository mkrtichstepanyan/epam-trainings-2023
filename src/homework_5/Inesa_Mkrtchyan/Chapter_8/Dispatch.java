package homework_5.Inesa_Mkrtchyan.Chapter_8;

class A3 {
    void callme() {
        System.out.println("Inside A's callme method");
    }
}

class B3 extends A3 {
    void callme() {
        System.out.println("Inside B's callme method");
    }
}

class C3 extends A3 {
    void callme() {
        System.out.println("Inside C's callme method");
    }
}

public class Dispatch {
    public static void main(String[] args) {
        A3 a = new A3();
        B3 b = new B3();
        C3 c = new C3();
        A3 r;
        r = a;
        r.callme();
        r = b;
        r.callme();
        r = c;
        r.callme();
    }
}
