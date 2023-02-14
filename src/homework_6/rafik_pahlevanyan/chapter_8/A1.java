package homework_6.rafik_pahlevanyan.chapter_8;

/*
    In a class hierarchy, private members remain
    private to their class.
    This program contains an error and wil not compile.
 */
//Create a superclass
public class A1 {
    int i;  //default access
    private int j;  //private to A1

    void setij(int x, int y) {
        i = x;
        j = y;
    }
}