package homework_6.Nona_Asatryan.chapter8;

public class B3 extends A3 {
    int i;    // this i hides the i in A3

    B3(int a, int b) {
        super.i = a;     // i in A3
        i = b;   // i in B3
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
