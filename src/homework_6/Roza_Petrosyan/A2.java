package homework_6.Roza_Petrosyan;

// Create a superclass
public class A2 {
    int i; // default access
    private int j; // private to A

    void setij(int x, int y){
        i = x;
        j = y;
    }
}

// A's j is not accessable here

class B2 extends A2{
    int total;

    void sum() {
//        total = i + j; // Error j is notaccessable here
    }
}
