package homework_6.Samvel_Hakobyan.Chapter_8;

public class A3 {
    A3(){
        System.out.println("Inside A`s constructor. ");
    }
}
class B3 extends  A3{
    B3(){
        System.out.println("Inside B`s constructor. ");
    }
}
class C extends B3{
    C(){
        System.out.println("Inside C`s constructor. ");
    }
}
class CallingCons{
    public static void main(String[] args) {
        C c = new C();
    }
}