package homework_6.Shushanik_Araqelyan.chapter8;
class A5{
    void callme(){
        System.out.println(" Inside A's callme method");
    }
}
class B5 extends A5{
    void callme(){
        System.out.println(" Inside B5's callme method");
    }

}
class C2 extends A5{
    void callme(){
        System.out.println(" Inside B5's callme method");
    }
}
