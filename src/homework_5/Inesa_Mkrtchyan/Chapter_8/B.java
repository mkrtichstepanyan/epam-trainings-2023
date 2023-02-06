package Homework5.Inesa_Mkrtchyan.Chapter_8;

public class B extends A {
    int k;

    B(int a, int b) {
        super.i = a;
        i = b;
    }

    B() {
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void show() {
        System.out.println("i in superclass: " + super.i);
        System.out.println("i in subclass: " + i);
    }

    void sum() {
        System.out.println("i+j+k" + (i + j + k));
        //System.out.println(pj);//Error j is private
    }
}
