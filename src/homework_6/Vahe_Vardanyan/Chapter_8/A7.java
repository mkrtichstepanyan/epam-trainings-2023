package homework_6.Vahe_Vardanyan.Chapter_8;

abstract class A7{
    abstract void callme();

    void callmetoo(){
        System.out.println("This is a concrete method.");
    }
}
class B7 extends A7{
    void callme(){
        System.out.println("B7`s implementation of callme. ");
    }
}
class AbstractDemo{
    public static void main(String[] args) {
        B7 b7 = new B7();

        b7.callme();
        b7.callmetoo();
    }
}

