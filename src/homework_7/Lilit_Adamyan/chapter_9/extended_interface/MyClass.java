package homework_7.Lilit_Adamyan.chapter_9.extended_interface;

public class MyClass implements B{
    @Override
    public void meth1() {
        System.out.println("Implement meth1().");
    }

    @Override
    public void meth2() {
        System.out.println("Implement meth2().");
    }

    @Override
    public void meth3() {
        System.out.println("Implement meth3().");
    }
    class IfExtend{
        public static void main(String[] args) {
            MyClass ob = new MyClass();
            ob.meth1();
            ob.meth2();
            ob.meth3();
        }
    }
}
