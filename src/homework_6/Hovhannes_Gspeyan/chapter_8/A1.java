package homework_6.Hovhannes_Gspeyan.chapter_8;

public class A1 {
    int i, j;

    public A1(int a, int b) {
        this.i = a;
        this.j = b;
    }
    void show(){
        System.out.println("i and j: " + i + " " + j);
    }
}
class B2 extends A1{
    int k;

    public B2(int a, int b, int c) {
        super(a, b);
        this.k = c;
    }
    void show(){
        super.show();
        System.out.println("k: " + k);
    }
    void show(String msg){
        System.out.println(msg + k);
    }
}
