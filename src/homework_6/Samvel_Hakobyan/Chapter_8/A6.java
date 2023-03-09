package homework_6.Samvel_Hakobyan.Chapter_8;

public class A6 {
    void callme() {
        System.out.println("Inside A.java`s callme method ");
    }
}

class B7 extends A6 {
    void callme() {
        System.out.println("Inside B`s callme method");
    }
}

class C1 extends A6 {
    void callme() {
        System.out.println("Inside C`s callme method");
    }
}

class Dispatch {
    public static void main(String[] args) {
        A6 a = new A6();
        B7 b = new B7();
        C1 c = new C1();
        A6 r;

        r = a;
        r.callme();

        r = b;
        r.callme();

        r = c;
        r.callme();

    }
}
