package homework_6.Roza_Petrosyan;

abstract class A8 {
    abstract void callMe();

    void callMeToo(){
        System.out.println("This is a concrete method.");
    }
}

class B8 extends A8{
    @java.lang.Override
    void callMe() {
        System.out.println("B's implementation of callMe");
    }
}
