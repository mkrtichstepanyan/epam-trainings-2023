package homework_6.Shushanik_Araqelyan.chapter8;

public class A2 {
    A2(){
        System.out.println(" Inside A2's constructor .");

    }
}
class B2 extends A2{
    B2(){
        System.out.println("Inside B2's constructor.");

    }
}
class C extends B2{
    C(){
        System.out.println("Inside C's constructor");
    }
}
