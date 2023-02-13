package homework_6.Samvel_Hakobyan.Chapter_8;

public class A4 {
    int i, j;

    A4(int a, int b) {
        i = a;
        j = b;
    }

    void show() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }
    void show(){
        System.out.println("k: " + k);
    }
}
class Override{
    public static void main(String[] args) {

        B4 subOb = new B4(1,1,3);
        subOb.show();
    }
}
class B5 extends  A4{
    int k;
    B5(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void  show(){
        super.show();
        System.out.println("k: " + k);
    }
}