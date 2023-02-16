package homework_6.garik_gharibyan.chapter_8;
class A6{
    void callMe(){
        System.out.println("Inside A's callMe method");
    }
}
class  B6 extends A6{
    void callMe(){
        System.out.println("Inside B's callMe method");
    }
}
class  C6 extends B6{
    void callMe(){
        System.out.println("Inside C's callMe method");
    }
}

public class Dispatch {
    public static void main(String[] args) {

        A6 r;
        A6 a = new A6();
        B6 b = new B6();
        C6 c = new C6();

        r = a;
        a.callMe();

        r = b;
        b.callMe();

        r = c;
        r.callMe();
    }
}
