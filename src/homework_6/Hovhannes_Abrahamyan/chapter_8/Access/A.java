package homework_6.Hovhannes_Abrahamyan.chapter_8.Access;

public class A {
    int i; // default access
    private int j; // private to A

    void setij(int x, int y){
        i = x;
        j = y;
    }
}