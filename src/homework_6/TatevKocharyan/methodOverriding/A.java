package homework_6.TatevKocharyan.methodOverriding;


public class A {
    int i;
    int j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void show() {

        System.out.println("i and j:" + i + " " + j);
    }
}