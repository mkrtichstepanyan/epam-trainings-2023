package homework_6.Anush_Ananyan.chapter_8;
import java.net.SocketTimeoutException;

public class A {
    int i, j;
    private int l;
    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
    void  setil(int x, int y){
        i = x;
        l = y;
    }
    A() {
        System.out.println("Inside A.java's constructor.");
    }
    A(int a, int b) {
        i = a;
        j = b;
    }
    void show() {
        System.out.println("i and j: " + i + " " + j );
    }
    void callme() {
        System.out.println("Inside A.java's callme method");
    }
}
