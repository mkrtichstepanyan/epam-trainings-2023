package homework_6.gohar_hakobyan.chapter_8;

public class A {
    int i, j;

    A() {
        System.out.println("B in constructor A.java");
    }

    void callme() {
        System.out.println("In method callme from A.java class");
    }
//  private   int total; This program will not compile

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}

class B extends A {
    int k;

    B() {
        System.out.println("B in constructor B");
    }

    void callMe() {
        System.out.println("In method callme from B class");
    }

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
//        total = i + j; not compile Total is private
        System.out.println("i + j + k: " + (i + j + k));
    }
}

class E extends A{
    void callme() {
        System.out.println("In method callme from E class");
    }
}