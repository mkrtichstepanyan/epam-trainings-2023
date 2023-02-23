package homework_8.Hovhannes_Gspeyan.chapter_9.inheritedInterface;

public class MyClass implements B1 {

    @Override
    public void meth3() {
        System.out.println("implement meth3()");
    }

    @Override
    public void meth1() {
        System.out.println("implement meth2()");
    }

    @Override
    public void meth2() {
        System.out.println("implement meth1()");
    }
}
