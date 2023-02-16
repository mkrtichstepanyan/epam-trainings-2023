package homework_6.Anush_Ananyan.chapter_8;

public class Bs extends As {
    int i;
    Bs(int a, int b) {
        super.i = a;
        i = b;
    }
    void show() {
        System.out.println("i in superclass: " +super.i);
        System.out.println("i in subclass: " + i);
    }
}
