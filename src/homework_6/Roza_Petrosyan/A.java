package homework_6.Roza_Petrosyan;

// A simple example of inheritance
// Create a superclass
public class A {
    int i, j;

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

// Create a subclass by extending class A

class B extends A {
    int k;

    void showk() {
        System.out.println("k: " + k);
    }

    void sum() {
        System.out.println("i + j + k" + (i + j + k));
    }
}
