package homework_6.Liana_Gevorgyan.Chapter_8;

public class Override1 {
    public static void main(String[] args) {
        B4 subOb = new B4 (1,2,3);
        subOb.show("This is k: "); // this call show() in B3
        subOb.show();//this calls show() in A3
    }
}
// Methods with differing type signatures are overloaded – not
// overridden.
class A4 {
    int i, j;
    A4(int a, int b) {
        i = a;
        j = b; }
    // display i and j
    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}
// Create a subclass by extending class A.
class B4 extends A4 {
    int k;
    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    // overload show()
    void show(String msg) {
        System.out.println(msg + k);
    }
}