package homework_5.Inesa_Mkrtchyan.Chapter_8;

class A1 {
    A1() {
        System.out.println("Inside A's constructor.");
    }
}

class B1 extends A1 {
    B1() {
        System.out.println("Inside B's constructor.");
    }
}

class C extends B1 {
    C() {
        System.out.println("Inside C's constructor.");
    }
}

public class CallingCons {
    public static void main(String[] args) {
        C c = new C();
    }
}
