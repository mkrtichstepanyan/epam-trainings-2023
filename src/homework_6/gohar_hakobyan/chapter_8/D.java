package homework_6.gohar_hakobyan.chapter_8;

public class D extends A {
    int i;
    D(int a, int b) {
        super.i = a; // i in A
        i = b; // i in C
    }

    void show() {
        System.out.println("i in superclass " + super.i);
        System.out.println("i in subclass " + i);
    }
}

