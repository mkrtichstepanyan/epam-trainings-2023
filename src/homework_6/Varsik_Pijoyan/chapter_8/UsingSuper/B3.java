package homework_6.Varsik_Pijoyan.chapter_8.UsingSuper;



public class B3 extends A3 {
    int i;
    B3(int a, int b){
        super.i = a; //i on A3
        i = b; //i in B3
    }

    void show(){
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
