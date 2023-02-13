package homework_6.Hovhannes_Gspeyan.chapter_8;

/**
 * Simple example of inheritance
 */
public class A {
    int i, j;

    A(){
        System.out.println("Insides A's constructor ");
    }

    void show(){
        System.out.println("i and j: " + i + j);
    }
    void showIJ(){
        System.out.println("i and j: " + i + " " + j);
    }
    final void meth(){
        System.out.println("this is a final method ");
    }
}

/**
 * B subclass of A
 */
class B extends A{
    int k;

    B(){
        System.out.println("Insides B's constructor ");
    }

    void showK(){
        System.out.println("k: " + k);
    }
    void show(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i + j + k: " + (i + j + k));
    }
   // void meth(){       ERROR! can not be overridden
   //     System.out.println("Illegal! ");
    }

