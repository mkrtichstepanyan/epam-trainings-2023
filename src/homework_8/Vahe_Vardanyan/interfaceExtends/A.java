package homework_8.Vahe_Vardanyan.interfaceExtends;

public interface A {
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
}
class MyClass implements B{
    public void meth1(){
        System.out.println("Implement meth1().");
    }
    public void meth2(){
        System.out.println("Implement meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3().");

    }
}
class IfExtend{
    public static void main(String[] args) {
        MyClass ob = new MyClass();
        ob.meth1();
        ob.meth2();
        ob.meth3();
    }
}
