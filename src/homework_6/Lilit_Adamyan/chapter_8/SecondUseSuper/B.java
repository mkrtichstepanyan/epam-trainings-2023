package homework_6.Lilit_Adamyan.chapter_8.SecondUseSuper;

public class B extends A{
    int i;

    public B(int a ,int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in superclass : " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
