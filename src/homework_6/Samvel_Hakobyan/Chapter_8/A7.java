package homework_6.Samvel_Hakobyan.Chapter_8;

abstract class A7 {
    abstract  void callme();

    void  callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
class B8 extends A7{

    void callme() {
        System.out.println("B`s implementation of callme.");
    }
}
class  AbstractDemo{
    public static void main(String[] args) {

        B8 b = new B8();

        b.callme();
        b.callmetoo();
    }
}