package homework_6.Shushanik_Araqelyan.chapter8;

public class Override {
    public static void main(String[] args) {
        B subOb = new B(1, 2, 3);
        subOb.show();
    }
}
class B extends A{
    int k;
    B(int a, int b, int c){
        super(a,b);
        k = c;
    }
    void show(){
        super.show();
        System.out.println(" k : " + k);
    }
}