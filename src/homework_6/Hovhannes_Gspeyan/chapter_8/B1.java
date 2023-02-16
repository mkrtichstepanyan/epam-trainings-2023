package homework_6.Hovhannes_Gspeyan.chapter_8;

/**
 * Introducing to super keyword
 */
public class B1 extends A{
    int i;

    B1(int a, int b){
        super.i = a;
        this.i = b;
    }
    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + this.i);
    }
}
