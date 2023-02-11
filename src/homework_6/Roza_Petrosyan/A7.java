package homework_6.Roza_Petrosyan;

public class A7 {
    void callMe(){
        System.out.println("Inside A's callMe method");
    }
}

class B7 extends A7{
    @java.lang.Override
    void callMe() {
        System.out.println("Inside B's callMe method");
    }
}

class C7 extends A7{
    @java.lang.Override
    void callMe() {
        System.out.println("Inside C's callMe method");
    }
}
