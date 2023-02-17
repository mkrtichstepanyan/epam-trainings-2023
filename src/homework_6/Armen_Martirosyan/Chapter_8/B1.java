package homework_6.Armen_Martirosyan.Chapter_8;

public class B1 extends A1 {
    int i;

    public B1(int a, int b) {
        super.i = a;
        this.i = b;
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }
}
