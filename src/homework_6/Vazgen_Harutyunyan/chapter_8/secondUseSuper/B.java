package homework_6.Vazgen_Harutyunyan.chapter_8.secondUseSuper;

public class B extends A{
    int i;

    B(int a,int b){
        super.i = a;
        i = b;
    }

    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
