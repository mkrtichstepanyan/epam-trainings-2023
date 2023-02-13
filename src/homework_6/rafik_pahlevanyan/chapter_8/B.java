package homework_6.rafik_pahlevanyan.chapter_8;

//Create a subclass by extending class A
class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i+j+k: " + (i + j + k));
    }
}