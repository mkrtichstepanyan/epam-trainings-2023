package homework_8.Vahe_Vardanyan.InterfaceExtends;

public interface A {
    void meth1();
    void meth2();
}
interface B extends A{
    void meth3();
}
class Myclass implements  B{
    public void meth1(){
        System.out.println("implement meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("implement meth2().");

    }

    @Override
    public void meth3() {
        System.out.println("implement meth3().");

    }

    class IFExtend{
        public static void main(String[] args) {
            Myclass ob = new Myclass();

            ob.meth1();
            ob.meth2();
            ob.meth3();
        }
    }
}
