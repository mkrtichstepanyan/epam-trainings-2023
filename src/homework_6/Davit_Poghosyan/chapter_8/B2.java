package homework_6.Davit_Poghosyan.chapter_8;

public class B2 extends A2{
    int i;
    B2(int a , int b){
        super.i = a;
        i = b;
    }
    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
