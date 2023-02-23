package homework_8.Anushik_Gevorgyan.Interface;

public class MyClass implements B1{
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
