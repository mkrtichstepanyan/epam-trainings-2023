package homework_6.rafik_pahlevanyan.chapter_8;

//Methods with differing type signatures are overloaded - not
//overridden
public class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }

    //display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}