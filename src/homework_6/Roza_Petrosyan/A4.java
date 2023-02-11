package homework_6.Roza_Petrosyan;

public class A4 {
    A4() {
        System.out.println("Inside A4's constructor");
    }
}

class B4 extends A4 {
    B4() {
        System.out.println("Inside B4's constructor");
    }
}

class C4 extends B4 {
    C4() {
        System.out.println("Inside C4's constructor");
    }
}