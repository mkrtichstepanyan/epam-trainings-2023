package chapter_8.Hovhannes_Abrahamyan.Access;

public class A {
    int i; // default access
    private int j; // private to A

    void setij(int x, int y){
        i = x;
        j = y;
    }
}