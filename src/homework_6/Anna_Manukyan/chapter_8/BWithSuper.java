package homework_6.Anna_Manukyan.chapter_8;

//Create a subclasses by extending from A.java
public class BWithSuper extends A {
    int i;

    public BWithSuper(int a, int b) {
        super.i = a;
        i = b;
    }

    void show() {
        System.out.println("i in superclass " + super.i);
        System.out.println("i in subclass " + i);
    }

}
