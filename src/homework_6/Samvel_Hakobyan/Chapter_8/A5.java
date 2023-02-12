package homework_6.Samvel_Hakobyan.Chapter_8;

public class A5 {
    int i, j;

    A5(int a, int b) {
        i = a;
        j = b;
    }
    void show(){
        System.out.println(" i and j: " + i + " " +j);
    }
}
class B6 extends A5{
    int k;
    B6(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void  show(String msg){
        System.out.println(msg + k);
    }
}
class Override1{
    public static void main(String[] args) {
        B6 sunOb = new B6(1,2,3);
        sunOb.show("This is k: ");
        sunOb.show();
    }
}
