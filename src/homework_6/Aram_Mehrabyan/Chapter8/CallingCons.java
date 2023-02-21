package homework_6.Aram_Mehrabyan.Chapter8;
class A3{
    A3(){
        System.out.println("Inside A3 constructor");
    }
}
class B3 extends A3{
    B3(){
        System.out.println("Inside B3 constructor");
    }
}
class C3 extends B3{
    C3(){
        System.out.println("Inside C3 constructor");
    }
}
public class CallingCons {
    public static void main(String[] args) {
        C3 c=new C3();
    }
}
