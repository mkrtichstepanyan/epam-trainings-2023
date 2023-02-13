package homework_6.Vahe_Vardanyan.Chapter_8;

public class A8 {
    void meth(){
        System.out.println("This is a final method. ");
    }
}
class B8 extends A8{
    void meth(){
        System.out.println("Illegal ! ");
    }
}