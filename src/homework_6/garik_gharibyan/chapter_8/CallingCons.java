package homework_6.garik_gharibyan.chapter_8;

class A3 {
    A3() {
        System.out.println("inside A's constructor.");
    }
}
class B3 extends A3 {
    B3() {
        System.out.println("inside B's constructor.");
    }
}
class C3 extends B3 {
    C3() {
        System.out.println("inside C's constructor.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C3 c  = new C3();

    }
}
