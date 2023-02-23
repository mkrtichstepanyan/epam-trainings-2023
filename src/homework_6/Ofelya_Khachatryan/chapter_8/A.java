package homework_6.Ofelya_Khachatryan.chapter_8;

public class A {

    int i;
    int j;  //private modifier will give an error!

    A() {
        System.out.println("Inside A.java's constructor.");
    }

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }

    void setij(int x, int y) {
        i = x;
        j = y;
    }

    void callme() {
        System.out.println("Inside A.java's callme method");
    }

    final void meth() {
        System.out.println("This is a final method.");
    }
}
