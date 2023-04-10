package homework_6.Sofya_Ghazaryan.Chapter_8;

public class B_2 extends A_2 {
    int i;

    B_2(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
